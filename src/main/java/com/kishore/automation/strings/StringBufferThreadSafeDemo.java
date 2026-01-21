package com.kishore.automation.strings;

public class StringBufferThreadSafeDemo {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();

        //Purpose: Show thread-safe behavior (conceptually).
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                buffer.append(Thread.currentThread().getName()).append(" ");
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();
    }
}
