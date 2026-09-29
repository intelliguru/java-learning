package com.intelliguru.util;

import com.intelliguru.service.EmailService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Startup implements CommandLineRunner {
    private final EmailService emailService;

    public Startup(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void run(String... args) {
        System.out.println(
                "Caller thread: " +
                        Thread.currentThread().getName()
        );

        emailService.sendEmail();
    }
}
