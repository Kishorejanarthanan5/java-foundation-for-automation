package com.kishore.automation.basics;

import java.util.Scanner;

public class ReadAge {
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Your are eligible to vote");
        }
            else
            {
                System.out.println("Your are not eligible to vote");
            }

        scan.close();
    }
}
