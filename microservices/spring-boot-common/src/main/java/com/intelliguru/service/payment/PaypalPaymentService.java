package com.intelliguru.service.payment;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {

    @Override
    public void pay() {
        System.out.println("PayPal payment");
    }
}
