package com.kishore.automation.basics.wrappers;

public class StringVsNumberExample {
    public static void main(String[] args) {
        String timeoutFromConfig = "30";
        int timeout = Integer.parseInt(timeoutFromConfig);
        System.out.println("Timeout value: " + timeout);

        String input = "abc";
        try {
            int value = Integer.parseInt(input);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
