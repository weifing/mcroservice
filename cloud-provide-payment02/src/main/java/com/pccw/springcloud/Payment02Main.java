package com.pccw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Payment02Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment02Main.class, args);
    }
}
