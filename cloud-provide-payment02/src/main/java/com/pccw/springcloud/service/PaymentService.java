package com.pccw.springcloud.service;

import com.pccw.springcloud.pojo.Payment;


public interface PaymentService {
    int creat(Payment dept);

    Payment queryById(Long id);
}
