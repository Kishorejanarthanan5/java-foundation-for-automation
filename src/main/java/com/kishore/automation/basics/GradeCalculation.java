package com.kishore.automation.basics;
import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = scan.nextInt();

        if (marks >= 0 && marks <= 59)
        {
            System.out.println("Grade: F");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: D");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: C");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Enter valid mark");
        }
    }
}
