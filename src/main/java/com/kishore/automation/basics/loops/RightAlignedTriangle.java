package com.kishore.automation.basics.loops;

public class RightAlignedTriangle {

        public static void main(String[] args) {

            int n = 4;
            for (int i = 1; i <= n; i++) {
                // print leading spaces
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }
                // print stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

