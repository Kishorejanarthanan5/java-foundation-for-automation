package com.kishore.automation.methods;

public class PrintTestSummary {
    public static void main(String[] args) {
        printSummary(10, 8, 2);
    }

    static void printSummary(int total, int passed, int failed) {
        System.out.println("Total Tests: " + total);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
    }
}
