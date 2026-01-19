package com.kishore.automation.basics.loops;

public class ShiftedTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for (int s=1; s <= n-i; s++){
                System.out.print(" ");
            }
            for (int p=1; p <= i; p++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
