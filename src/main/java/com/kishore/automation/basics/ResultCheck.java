package com.kishore.automation.basics;

import java.util.Scanner;

public class ResultCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Mark:");
        int mark = scan.nextInt();

        if (mark >= 35)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
        scan.close();
    }
}
