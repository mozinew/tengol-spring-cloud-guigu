package com.tengol.springcloud.guigu.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Order80Application - 订单服务的主启动类
 *
 * @author dongrui
 * @date 2020/3/22 21:30
 */
@Slf4j
@SpringBootApplication
public class Order80Application {
    public static void main(String[] args) {
        SpringApplication.run(Order80Application.class, args);
        log.info("Order80Application start successfully......");
    }
}
