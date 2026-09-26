package com.intelliguru.service;

//What Happens If a Spring Bean Throws an Exception During Startup?

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class MyPaymentService {

    @PostConstruct
    public void init() {
        System.out.println("Initializing PaymentService...");

        throw new RuntimeException(
                "Payment configuration failed!"
        );
    }
}
