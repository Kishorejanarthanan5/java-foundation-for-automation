package com.kishore.automation.basics;
import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age >= 0 && age <=12) {
            System.out.print("Child");
        } else if (age > 12 && age <= 18) {
            System.out.print("Teen");
        } else if (age > 19 && age <= 50) {
            System.out.print("Adult");
        } else if (age > 50 && age <= 90 ) {
            System.out.print("Senior Citizen");
        }else
        {
            System.out.print("Please enter valid age");
        }

        scanner.close();
    }
}
