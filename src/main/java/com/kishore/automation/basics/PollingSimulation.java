package com.kishore.automation.basics;

public class PollingSimulation {
    public static void main(String[] args) {
        int m = 5;
        int s = 1;
        while(s <= m)
        {
            System.out.println("Checking status... Attempt" + s);
            s++;
        }
        System.out.println("Polling stopped after max attempts");
    }
}
