package com.pccw.springcloud.service.impl;

import com.pccw.springcloud.dao.PaymentDao;
import com.pccw.springcloud.pojo.Payment;
import com.pccw.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int creat(Payment dept) {
        return paymentDao.create(dept);
    }

    @Override
    public Payment queryById(Long id) {
        return paymentDao.queryById(id);
    }
}
