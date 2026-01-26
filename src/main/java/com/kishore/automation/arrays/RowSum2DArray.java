package com.kishore.automation.arrays;
import java.util.Scanner;

public class RowSum2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        // Taking input
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Calculating row sum
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = sum + numbers[i][j];
            }
            System.out.println("Sum of row " + i + " = " + sum);
        }

        sc.close();
    }
}
