package com.pccw.springcloud.gateway;

import com.pccw.springcloud.gateway.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class GateWayMain {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain.class, args);
    }
   /* @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }*/
}
