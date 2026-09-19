package com.intelliguru.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceV1 {
    public void processOrder() {
        // process order...

        System.out.println("processOrder thread: "
                + Thread.currentThread().getName());

        sendEmail(); // ❌ Self-invocation
    }
    @Async
    public void sendEmail() {
        System.out.println("sendEmail thread: "
                + Thread.currentThread().getName());
    }
}
