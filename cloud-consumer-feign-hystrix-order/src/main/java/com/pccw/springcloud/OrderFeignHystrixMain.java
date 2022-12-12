package com.pccw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker//激活hystrix服务降级
public class OrderFeignHystrixMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixMain.class, args);
    }
}
