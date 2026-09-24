package com.intelliguru.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentHistoryService {
    private final PaymentService paymentService;

    public PaymentHistoryService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
