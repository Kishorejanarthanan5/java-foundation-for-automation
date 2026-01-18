package com.kishore.automation.arrays;

public class IndexOfMaximumElement {
    public static void main(String[] args) {

        int[] numbers = {5, 12, 7, 20, 3};

        int max = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("Index = " + maxIndex);
    }
}
