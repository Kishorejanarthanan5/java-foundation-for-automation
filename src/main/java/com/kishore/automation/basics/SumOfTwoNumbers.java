package com.kishore.automation.basics;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First number: " );
        int num1 = scan.nextInt();

        System.out.println("Enter Second number: " );
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of numbers: "+ sum );

        scan.close();
    }
}
