package com.intelliguru.service;

import com.intelliguru.model.User;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncDemoService {

    //@Async vs CompletableFuture — What's the Difference?


    // 1. Spring @Async
    @Async
    public void sendEmail() {
        System.out.println("Sending email...");
    }


    // 2. Java CompletableFuture
    public CompletableFuture<String> getUserName() {

        return CompletableFuture
                .supplyAsync(this::fetchUser)
                .thenApply(User::getName);
    }


    // 3. @Async + CompletableFuture together
    @Async
    public CompletableFuture<User> getUser() {

        User user = fetchUser();

        return CompletableFuture.completedFuture(user);
    }


    private User fetchUser() {
        return new User(1L, "Rahul");
    }
}