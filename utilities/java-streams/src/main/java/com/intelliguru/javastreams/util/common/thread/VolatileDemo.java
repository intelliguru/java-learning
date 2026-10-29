package com.intelliguru.javastreams.util.common.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileDemo {

    private static final AtomicInteger count =
            new AtomicInteger(0);

    public static void main(String[] args)
            throws InterruptedException {

        Thread t1 = new Thread(VolatileDemo::increment);
        Thread t2 = new Thread(VolatileDemo::increment);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + count);
    }

    private static void increment() {
        for (int i = 0; i < 100_000; i++) {
            count.incrementAndGet();
        }
    }
}
