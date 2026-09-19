package com.intelliguru.service;


import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final EmailService emailService;

    public OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void processOrder() {
        System.out.println("processOrder thread: "
                + Thread.currentThread().getName());

        emailService.sendEmail(); // ✅ Goes through proxy
    }
}
