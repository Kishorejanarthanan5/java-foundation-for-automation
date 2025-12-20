package com.kishore.automation.basics;
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to check Positive or Negative: ");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        scan.close();
    }
}
