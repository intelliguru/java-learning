package com.intelliguru.config;

import com.intelliguru.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {
    @Bean
    public PaymentService paymentService() {
        System.out.println("Creating PaymentService bean...");
        return new PaymentService();
    }
}
