package com.tianquan.trade.order.service;


import com.tianquan.trade.order.db.model.Order;

/**
 * 订单相关服务接口
 */
public interface OrderService {
    /**
     * 创建订单
     * @param userId
     * @param goodsId
     * @return
     */
    Order createOrder(long userId,long goodsId);

    /**
     * 订单查询
     * @param orderId
     * @return
     */
    Order queryOrder(long orderId);

    /**
     * 支付订单
     * @param orderId
     */
    void payOrder(long orderId);

    /**
     * 修改对应的订单信息
     *
     * @param order
     * @return
     */
    boolean updateOrder(Order order);
}
