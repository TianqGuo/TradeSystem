package com.tianquan.trade.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.tianquan"})
@MapperScan({"com.tianquan.trade.goods.db.mappers"})
@SpringBootApplication
public class TradeGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeGoodsApplication.class, args);
    }

}
