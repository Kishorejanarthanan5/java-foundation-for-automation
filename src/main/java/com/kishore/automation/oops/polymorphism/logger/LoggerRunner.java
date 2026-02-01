package com.kishore.automation.oops.polymorphism.logger;

public class LoggerRunner {
    public static void main(String[] args) {
        Logger logger;

        logger = new FileLogger();
        logger.log("File error occurred");

        logger = new FileLogger();
        logger.log("Console debug message");
    }
}
