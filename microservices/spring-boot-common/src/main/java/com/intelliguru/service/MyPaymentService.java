package com.intelliguru.service;

//What Does @PostConstruct Actually Do in Spring Boot?

import com.intelliguru.PaymentClient;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class MyPaymentService {
    private final PaymentClient paymentClient;

    public MyPaymentService(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
        System.out.println("1. Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. @PostConstruct called");
        System.out.println(
                "PaymentClient: " + paymentClient
        );
    }
}
