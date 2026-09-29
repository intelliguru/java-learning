package com.intelliguru.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Async
    public void sendEmail() {
        System.out.println("sendEmail thread: "
                + Thread.currentThread().getName());
    }
}
