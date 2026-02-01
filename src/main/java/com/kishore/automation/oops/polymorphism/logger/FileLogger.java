package com.kishore.automation.oops.polymorphism.logger;

public class FileLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Logging to FILE: " + message);
    }
}
