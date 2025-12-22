package com.kishore.automation.strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        int count=0;
        for (int i =0; i<input.length(); i++ )
        {
            char ch = input.charAt(i);

            if (ch =='a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count = count + 1;
            }
        }
        System.out.println("Vowel count: " + count);
        scanner.close();
    }
}
