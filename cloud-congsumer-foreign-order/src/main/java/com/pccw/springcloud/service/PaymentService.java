package com.pccw.springcloud.service;

import com.pccw.springcloud.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@ComponentScan
@FeignClient(value = "mcroservice-payment")//使用feign
public interface PaymentService {
    //调用生产着微服务名称为mcroservice-payment下边的获取订单接口
    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id);

    //调用生产者微服务名称为mcroservice-payment下边的模拟超时的接口
    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeOut() throws InterruptedException;
}
