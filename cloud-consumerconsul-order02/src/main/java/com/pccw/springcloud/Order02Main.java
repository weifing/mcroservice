package com.pccw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Order02Main {
    public static void main(String[] args) {
        SpringApplication.run(Order02Main.class, args);
    }
}
