package com.kishore.automation.basics;
import java.util.*;
public class PrintFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number. Please enter a positive number.");
        } else {
            System.out.println("Factors of " + number + " are:");

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

