package com.pccw.springcloud.dashboar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启Hystrix-dashboar实时监控
public class HystrixDashboarMain {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboarMain.class, args);
    }
}
