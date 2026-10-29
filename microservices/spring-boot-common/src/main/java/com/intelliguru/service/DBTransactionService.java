package com.intelliguru.service;

import com.intelliguru.entity.Order;
import com.intelliguru.repository.OrderRepository;
import jakarta.transaction.Transactional;

public class DBTransactionService {
    private static OrderRepository repository;

    public DBTransactionService(OrderRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public static void processPayment() {

        repository.save(new Order("MacBook Pro"));

        throw new RuntimeException("Payment failed!");
    }
}
