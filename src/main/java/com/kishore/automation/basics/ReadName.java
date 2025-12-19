package com.kishore.automation.basics;

import java.util.Scanner;

public class ReadName {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Welcome " + name);
        scan.close();

    }
}
