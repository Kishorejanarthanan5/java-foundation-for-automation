package com.kishore.automation.basics;

public class StopExecutionOnFailure {
    public static void main(String[] args) {

        for (int testCase = 1; testCase <= 5; testCase++) {

            if (testCase == 3) {
                System.out.println("Failure occurred at Test Case " + testCase);
                break;
            }

            System.out.println("Test Case " + testCase + " executed");
        }
    }
}
