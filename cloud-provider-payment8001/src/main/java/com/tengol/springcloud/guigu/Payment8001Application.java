package com.tengol.springcloud.guigu;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主启动类
 *
 * @author dongrui
 * @date 2020/3/20 22:39
 */
@Slf4j
@SpringBootApplication
@MapperScan(basePackages = "com.tengol.springcloud.guigu.mapper")
public class Payment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001Application.class, args);
        log.info("Payment8001Application start successfully ......");
    }
}
