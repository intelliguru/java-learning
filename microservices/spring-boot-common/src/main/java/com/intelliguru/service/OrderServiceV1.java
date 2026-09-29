package com.intelliguru.service;

import com.intelliguru.service.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceV1 {
    private final PaymentService paymentService;

    public OrderServiceV1(
            @Qualifier("paypalPaymentService")
            PaymentService paymentService) {

        this.paymentService = paymentService;
    }

    public void processPayment() {
        paymentService.pay();
    }
}
