package com.pccw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //激活feign的注解
public class OrderFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class);
    }
}
