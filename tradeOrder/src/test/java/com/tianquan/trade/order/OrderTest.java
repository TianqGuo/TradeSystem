package com.tianquan.trade.order;

import com.tianquan.trade.order.db.dao.OrderDao;
import com.tianquan.trade.order.db.model.Order;
import com.tianquan.trade.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderService orderService;

    @Test
    public void insertGoodsTest() {
        System.out.println("Hello");
        Order order = new Order();
        order.setUserId(123456L);
        order.setGoodsId(123L);
        order.setPayTime(new Date());
        order.setPayPrice(19800);
        boolean insertresult = orderDao.insertOrder(order);
        System.out.println(insertresult);
    }

    @Test
    public void insertGoodsTest2() {
       orderService.createOrder(123L,2L);
    }

}

