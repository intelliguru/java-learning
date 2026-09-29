package com.intelliguru.service;


import com.intelliguru.entity.Order;
import com.intelliguru.service.payment.PaymentService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processPayment(){
        paymentService.pay();
    }
































//    private final OrderRepository repository;
//
//    public OrderService(OrderRepository repository) {
//        this.repository = repository;
//    }
//
//    @Transactional
//    public void createOrder() {
//        saveOrder();
//    }
//
//    private void saveOrder() {
//
//        repository.save(new Order("Mobile"));
//
//        throw new RuntimeException("Payment failed!");
//    }


//    private final EmailService emailService;
//
//    public OrderService(EmailService emailService) {
//        this.emailService = emailService;
//    }

//    public void processOrder() {
//        System.out.println("processOrder thread: "
//                + Thread.currentThread().getName());
//
//        //emailService.sendEmail(); // ✅ Goes through proxy
//    }
}
