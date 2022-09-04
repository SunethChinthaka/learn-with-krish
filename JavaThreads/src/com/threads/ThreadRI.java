package com.threads;

class TestRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadRI {
    public static void main(String[] args) {
        TestRun testRun = new TestRun();
        Thread thread1 = new Thread(testRun);
        Thread thread2 = new Thread(testRun);
        thread1.start();
        thread2.start();

    }
}

