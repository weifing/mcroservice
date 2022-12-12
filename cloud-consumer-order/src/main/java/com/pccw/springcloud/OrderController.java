package com.pccw.springcloud;

import com.pccw.springcloud.pojo.CommonResult;
import com.pccw.springcloud.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    //调用支付订单服务的ip+端口
    private static final String PAYMENT_URL = "http://MCROSERVICE-PAYMENT/";

    //创建支付订单
    @RequestMapping("/consumer/payment/creat")
    public CommonResult<Payment> creat(Payment payment){
       return restTemplate.postForObject(PAYMENT_URL+"payment/create", payment, CommonResult.class);
    }

    //根据id获取支付订单
    @RequestMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> queryById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, CommonResult.class);
    }
}
