package com.pccw.springcloud.service;

import com.pccw.springcloud.pojo.Payment;
import org.springframework.stereotype.Service;


public interface PaymentService {
    int creat(Payment dept);

    Payment queryById(Long id);
}
