package com.kishore.automation.arrays;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter array data in integers: ");
        for (int i=0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print("Even numbers are: " + num + " ");
            }
        }
    }
}
