package com.kishore.automation.basics;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum =0;
        for(int num=1;num<=20;num++)
        {
            sum = sum + num;
        }
        System.out.println("SUM OF NUMBERS:"+ sum);
    }
}
