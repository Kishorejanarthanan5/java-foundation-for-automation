package com.kishore.automation.basics;
import java.util.Scanner;

public class SkipInvalidTransIds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Transaction ID: ");
            int id = sc.nextInt();

            if (id < 0) {
                System.out.println("Negative ID encountered. Stopping execution.");
                break;
            }

            if (id % 3 == 0) {
                System.out.println("Skipping invalid ID: " + id);
                continue;
            }

            System.out.println("Processing valid ID: " + id);
            break;
        } sc.close();
    }
}
