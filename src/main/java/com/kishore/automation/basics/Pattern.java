package com.kishore.automation.basics;

public class Pattern {

        public static void main(String[] args) {

            int rows = 4;

            // outer loop
            for (int i = 1; i <= rows; i++) {

                // inner loop
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                // move to next line
                System.out.println();
            }
        }
    }

