package com.kishore.automation.basics.staticvsinstance;

public class StaticMethodExample {
    static void log(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        log("Execution started");
    }
}
