package com.pccw.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall  paymentInfo_timeout 服务器出现故障,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall  paymentInfo_OK 服务器出现故障,o(╥﹏╥)o";
    }
}
