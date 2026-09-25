package com.intelliguru.util;

import com.intelliguru.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Startup implements CommandLineRunner {
    private final OrderService orderService;

    public Startup(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void run(String... args)  {
        orderService.processPayment();
    }
}
