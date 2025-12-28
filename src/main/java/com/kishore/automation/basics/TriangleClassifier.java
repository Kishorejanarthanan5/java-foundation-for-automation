package com.kishore.automation.basics;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side1: ");
        double side1 = scan.nextDouble();
        System.out.println("Enter the side2: ");
        double side2 = scan.nextDouble();
        System.out.println("Enter the side3: ");
        double side3 = scan.nextDouble();

        if (side1 == side2 && side1 == side3 ){
            System.out.println("Triangle is equilateral(Acute)");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Triangle is isosceles");
        } else {
            System.out.println("Triangle is scalene");
        }
    }
}
