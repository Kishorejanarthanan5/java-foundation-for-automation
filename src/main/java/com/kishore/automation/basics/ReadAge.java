package com.kishore.automation.basics;

import java.util.Scanner;

public class ReadAge {
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = scan.nextInt();

        System.out.println("Your age:" + age);

        scan.close();
    }
}
