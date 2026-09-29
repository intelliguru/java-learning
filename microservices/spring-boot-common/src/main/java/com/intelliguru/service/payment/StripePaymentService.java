package com.intelliguru.service.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class StripePaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Stripe payment");
    }
}
