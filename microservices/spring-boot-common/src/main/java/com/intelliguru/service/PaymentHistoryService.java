package com.intelliguru.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentHistoryService {
    private final MyPaymentService myPaymentService;

    public PaymentHistoryService(MyPaymentService myPaymentService) {
        this.myPaymentService = myPaymentService;
    }
}
