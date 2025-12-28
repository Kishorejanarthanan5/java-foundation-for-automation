package com.kishore.automation.basics;
import java.util.Scanner;

public class SearchTargetNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target value: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 1; i <= 10; i++) {

            if (i == target) {
                System.out.println("Target number found: " + i);
                found = true;
                break; // stop loop immediately
            }
        }

        if (!found) {
            System.out.println("Target number not found");
        }
    }
}
