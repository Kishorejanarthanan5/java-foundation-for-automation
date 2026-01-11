package com.kishore.automation.basics;

import java.util.Scanner;

public class SwitchDaysofWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the day: ");
            if (!scan.hasNextInt()) {
                System.out.println("Enter an valid input in Integer: ");
                scan.next();
                continue;
            }
            int day = scan.nextInt();
            if (day < 1 || day > 7) {
                System.out.println("Give a valid number between 1 to 7");
                continue;
            } else {
                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
            }
            break;
        }
        scan.close();
    }
}

