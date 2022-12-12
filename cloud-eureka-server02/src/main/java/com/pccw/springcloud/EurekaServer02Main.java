package com.pccw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer02Main {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer02Main.class, args);
    }
}
