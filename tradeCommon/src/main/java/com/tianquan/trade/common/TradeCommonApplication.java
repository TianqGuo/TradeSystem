package com.tianquan.trade.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TradeCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeCommonApplication.class, args);
    }

}
