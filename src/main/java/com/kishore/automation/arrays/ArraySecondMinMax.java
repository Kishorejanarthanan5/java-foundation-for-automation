package com.kishore.automation.arrays;

import java.util.Scanner;

public class ArraySecondMinMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        // Validation
        if (size < 2) {
            System.out.println("Array must contain at least 2 elements");
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : numbers) {

            // Find minimum
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2 && num != min1) {
                min2 = num;
            }

            // Find maximum
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (min2 == Integer.MAX_VALUE) {
            System.out.println("Second Minimum does not exist");
        } else {
            System.out.println("Second Minimum: " + min2);
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Second Maximum does not exist");
        } else {
            System.out.println("Second Maximum: " + max2);
        }

        sc.close();
    }
}
