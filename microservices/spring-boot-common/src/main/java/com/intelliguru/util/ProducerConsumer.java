package com.intelliguru.util;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    private final Queue<Integer> buffer = new LinkedList<>();
    private final int CAPACITY = 2;

    public synchronized void produce(int value)
            throws InterruptedException {

        // Wait while buffer is full
        while (buffer.size() == CAPACITY) {
            wait();
        }

        buffer.add(value);
        System.out.println("Produced: " + value);

        // Wake up waiting threads
        notifyAll();
    }

    public synchronized int consume()
            throws InterruptedException {

        // Wait while buffer is empty
        while (buffer.isEmpty()) {
            wait();
        }

        int value = buffer.poll();
        System.out.println("Consumed: " + value);

        // Wake up waiting threads
        notifyAll();

        return value;
    }

    public static void main(String[] args)
            throws InterruptedException {

        ProducerConsumer pc = new ProducerConsumer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    pc.produce(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    pc.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Processing completed!");
    }
}
