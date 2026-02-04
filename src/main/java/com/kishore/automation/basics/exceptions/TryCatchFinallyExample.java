package com.kishore.automation.basics.exceptions;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;   // runtime Arithmetic exception
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
        }finally {
            System.out.println("Finally block executed");
        }
    }
}
