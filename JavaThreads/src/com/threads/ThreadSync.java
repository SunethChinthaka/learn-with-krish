package com.threads;

public class ThreadSync {

    private static int count = 0;

    public static synchronized void incrementCount() {
        count++;
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    incrementCount();
                }
            }

        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    incrementCount();
                }
            }

        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value " + count);
    }
}
