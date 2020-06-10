package com.czr.springcloud.service;

import com.czr.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author czr
 * @Description: 类
 * @create 2020-06-08 14:48
 * @servion 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
