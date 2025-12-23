package com.kishore.automation.basics;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
        int a=1; int b = 5; int c = 5;

        if (a>b && a>c )
        {
            System.out.println("Largest value: "+ a);
        } else if (b>a && b>c)
        {
            System.out.println("Largest value:" +b);
        } else if (c>a && c>b)
        {
            System.out.println("Largest value:" +c);
        } else
        {
            System.out.println("More then one number has same value");
        }
    }
}
