package com.kishore.automation.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchDaysofWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = scan.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("Give a valid number");
        }
        else
        {
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
        scan.close();
    }
}

