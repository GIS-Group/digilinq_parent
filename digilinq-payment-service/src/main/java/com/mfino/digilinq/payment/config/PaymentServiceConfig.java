package com.mfino.digilinq.payment.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import feign.Logger;

/**
 * 
 * @author Krishna
 *
 */
@Configuration
public class PaymentServiceConfig {
    
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
    
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
}
