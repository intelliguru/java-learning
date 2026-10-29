package com.intelliguru.javastreams.util.common.thread;

public class ThreadInterview {

    public static void main(String[] args) {

        Thread t = new Thread(() ->
                System.out.println(
                    "Thread Name: "+    Thread.currentThread().getName()
                )
        );

        t.run();
        t.start();
    }
}
