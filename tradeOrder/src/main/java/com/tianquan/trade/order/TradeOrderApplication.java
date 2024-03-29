package com.tianquan.trade.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
@EnableFeignClients
@EnableDiscoveryClient
@EnableRabbit
@ComponentScan(basePackages = {"com.tianquan"})
@MapperScan({"com.tianquan.trade.order.db.mappers","com.tianquan.trade.goods.db.mappers","com.tianquan.trade.lightning.deal.db.mappers"})
@SpringBootApplication
public class TradeOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeOrderApplication.class, args);
    }

}
