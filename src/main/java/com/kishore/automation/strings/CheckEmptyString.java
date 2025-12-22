package com.kishore.automation.strings;

import java.util.Scanner;

public class CheckEmptyString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Empty string");
        } else {
            System.out.println("Not empty");
        }

        scanner.close();
    }
}
