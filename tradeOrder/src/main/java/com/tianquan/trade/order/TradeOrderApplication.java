package com.tianquan.trade.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableRabbit
@ComponentScan(basePackages = {"com.tianquan"})
@MapperScan({"com.tianquan.trade.order.db.mappers","com.tianquan.trade.goods.db.mappers",})
public class TradeOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeOrderApplication.class, args);
    }

}
