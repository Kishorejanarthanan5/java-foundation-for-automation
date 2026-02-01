package com.kishore.automation.oops.polymorphism.logger;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Logging to CONSOLE: "+message);
    }
}
