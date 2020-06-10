package com.czr.springcloud.service.impl;

import com.czr.springcloud.dao.PaymentDao;
import com.czr.springcloud.entities.Payment;
import com.czr.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author czr
 * @Description: 类
 * @create 2020-06-08 14:52
 * @servion 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
