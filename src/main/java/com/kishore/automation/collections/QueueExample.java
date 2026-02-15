package com.kishore.automation.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> executionQueue = new LinkedList<>();

        executionQueue.add("Test1");
        executionQueue.add("Test2");

        System.out.println("Running: " + executionQueue.poll());
        System.out.println("Next: " + executionQueue.peek());
    }
}
