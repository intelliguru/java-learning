package com.intelliguru.util;

import com.intelliguru.service.OrderService;
import com.intelliguru.service.OrderServiceV1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Startup implements CommandLineRunner {
    private final OrderService orderServiceV1;

    public Startup(OrderService orderServiceV1){
        this.orderServiceV1 = orderServiceV1;
    }
    @Override
    public void run(String... args) throws Exception {
        orderServiceV1.processOrder();
    }
}
