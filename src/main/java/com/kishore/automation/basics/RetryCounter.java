package com.kishore.automation.basics;

public class RetryCounter {
    public static void main(String[] args) {
        for (int T=1;T<=3;T++)
        {
            System.out.println("Retry Attempt: "+T);
        }
        System.out.println("Max retries reached");
    }
}
