package com.threads;

class X extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("X");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Y extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Y");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        X x = new X();
        x.start();

        Y y = new Y();
        y.start();
    }
}
