package com.kishore.automation.basics.loops;
import java.util.Scanner;

public class PrintNumbersWhile {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number you want to print:");
        int n =number.nextInt();
        int i =1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
        number.close();
    }

}
