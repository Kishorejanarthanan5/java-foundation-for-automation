package com.kishore.automation.basics;
import java.util.Scanner;
public class LoginRetryWithLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "admin123";

        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Login successful.");
                break;
            }

            attempts++;
            System.out.println("Invalid password. Attempts left: " + (3 - attempts));
        }

        if (attempts == 3) {
            System.out.println("Maximum attempts reached. Access blocked.");
        }

        sc.close();
    }
}
