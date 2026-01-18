package com.kishore.automation.arrays;

public class LargestEvenNumber {

    public static void main(String[] args) {

        int[] numbers = {3, 10, 7, 8, 20, 5};

        int largestEven = Integer.MIN_VALUE;
        boolean found = false;

        for (int num : numbers) {
            if (num % 2 == 0 && num > largestEven) {
                largestEven = num;
                found = true;
            }
        }

        if (found) {
            System.out.println(largestEven);
        } else {
            System.out.println("No even number found");
        }
    }
}

