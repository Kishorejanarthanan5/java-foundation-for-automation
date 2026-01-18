package com.kishore.automation.arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter array data in integers: ");
        for (int i=0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        for (int j=0; j < size; j++){
            if (numbers[j] > max){
                max = numbers[j];
            }
        }
        System.out.println("Maximum value: "+ max);

        int min = numbers[0];
        for (int j=0; j < size; j++){
            if (numbers[j] < min){
                min = numbers[j];
            }
        }
        System.out.println("Minimum value: "+ min);
    }
}
