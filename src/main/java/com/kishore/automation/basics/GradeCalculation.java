package com.kishore.automation.basics;
import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = scan.nextInt();

        if (marks >= 0 && marks <= 40)
        {
            System.out.println("Grade: D");
        } else if (marks > 40 && marks <= 60) {
            System.out.println("Grade: B");
        } else if (marks > 60 && marks <= 80) {
            System.out.println("Grade: A");
        } else if (marks > 80 && marks <= 100) {
            System.out.println("Grade: A+");
        } else {
            System.out.println("Enter valid mark");
        }
    }
}
