package com.intelliguru.config;

import com.intelliguru.service.payment.PaymentService;
import com.intelliguru.service.payment.StripePaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfig {

    @Bean("paymentService")
    public PaymentService stripePaymentService() {
        return new StripePaymentService();
    }
}
