package com.intelliguru.javastreams.util.common.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorInterview {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            System.out.println("Task started");
            int result = 10 / 0; // ArithmeticException
            System.out.println(result);
        });

        executor.shutdown();
    }
}
