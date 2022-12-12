package com.pccw.springcloud;

import com.pccw.springcloud.pojo.CommonResult;
import com.pccw.springcloud.pojo.Payment;
import com.pccw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult result = paymentService.queryById(id);
        return result;
    }

    @GetMapping("/consumer/feign/timeout")
    public String paymentFeignTimeOut() throws InterruptedException{
        return paymentService.paymentFeignTimeOut();
    }

}
