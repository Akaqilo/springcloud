package com.czr.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author czr
 * @Description: 类
 * @create 2020-06-11 18:08
 * @servion 1.0
 */
@RestController
@Slf4j
@RequestMapping(value = "payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("consul")
    public String paymentConsul(){
        return "springCloud with consul : " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
