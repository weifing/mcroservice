package com.pccw.springcloud.gateway.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FeignConfig {
    //配置日志级别
    @Bean
    public Logger.Level feignLoggerLevel(){
        //请求和响应的头信息，正文和元数据
        return Logger.Level.BASIC;
    }
}
