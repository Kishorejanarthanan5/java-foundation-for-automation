package com.kishore.automation.basics.staticvsinstance;

public class StaticVariableExample {

    static int executionCount = 0;

    public StaticVariableExample() {
        executionCount++;
    }

    public static void main(String[] args) {

        StaticVariableExample();
        new StaticVariableExample();
        new StaticVariableExample();

        System.out.println(executionCount);
    }
}