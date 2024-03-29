package com.tianquan.trade.lightning.deal.mq;

import com.alibaba.fastjson.JSON;
import com.tianquan.trade.common.service.LimitBuyService;
import com.tianquan.trade.lightning.deal.client.OrderFeignClient;
import com.tianquan.trade.lightning.deal.client.model.Order;
import com.tianquan.trade.lightning.deal.service.SeckillActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SeckillPayTimeOutReceiver {

    @Autowired
    private SeckillActivityService seckillActivityService;

    @Autowired
    private LimitBuyService limitBuyService;

    @Autowired
    private OrderFeignClient orderFeignClient;

    /**
     * 秒杀支付超时消息处理
     *
     * @param message
     */
    @RabbitListener(queues = "seckill.order.pay.status.check.queue")
    public void process(String message) {
        log.info("秒杀支付超时消息处理，接收到消息内容:{}", message);
        Order order = JSON.parseObject(message, Order.class);
        // 只处理秒杀商品订单
        if (order.getActivityType() != 1) {
            return;
        }
        //1.查询订单信息
        Order orderInfo = orderFeignClient.queryOrder(order.getId());
        //状态:0,没有可用库存订单创建失败;1,已创建，等待付款;2 已支付,等待发货;99 订单关闭，超时未付款
        if (orderInfo.getStatus() == 1) {
            //1.移除限购名单
            limitBuyService.removeLimitMember(order.getActivityId(), order.getUserId());
            //2.秒杀库存回补
            seckillActivityService.revertStock(order.getActivityId());
            log.info("订单{}超时支付，关闭订单", orderInfo.getId());
            orderInfo.setStatus(99);
            //3.更新订单状态为关闭
            orderFeignClient.updateOrder(orderInfo);
        }

    }
}

