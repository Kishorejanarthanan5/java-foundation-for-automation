package com.kishore.automation.basics.loops;

public class CountDigits {
    public static void main(String[] args) {
        int a = 12345;
        int count= 0;

        while (a != 0)
        {
            count = count +1;
            a = a/10;
        }
        System.out.println("Count of Digits: "+ count);
    }
}
