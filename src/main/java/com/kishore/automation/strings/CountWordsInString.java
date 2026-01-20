package com.kishore.automation.strings;

public class CountWordsInString {
    public static void main(String[] args) {

        String str = "Java automation testing";
        int count = 0;

        String[] words = str.trim().split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        System.out.println("Word count: " + count);
    }
}
