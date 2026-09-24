package com.intelliguru.service;

//Can you create a Spring Bean WITHOUT using @Component?🤔

public class PaymentService {

    public PaymentService() {
        System.out.println("PaymentService Constructor is called after ean creation............");
    }


    public void processPayment() {
        System.out.println("Payment Processed Successfully!!!!");
    }
}
