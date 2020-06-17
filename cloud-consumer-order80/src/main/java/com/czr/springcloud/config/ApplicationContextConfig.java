package com.czr.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author czr
 * @Description: 类
 * @create 2020-06-08 18:07
 * @servion 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    // @LoadBalanced   //负载均衡注解
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
