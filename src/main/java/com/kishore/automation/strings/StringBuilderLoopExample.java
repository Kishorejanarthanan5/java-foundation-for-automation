package com.kishore.automation.strings;

public class StringBuilderLoopExample {
    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            result.append("Step ").append(i).append(" | ");
        }

        System.out.println(result);
    }
}
