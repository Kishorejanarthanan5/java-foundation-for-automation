package com.kishore.automation.strings;

public class FindDuplicateCharacters {
    public static void main(String[] args) {

        String str = "JavaProgramming";
        char[] chars = str.toLowerCase().toCharArray();

        boolean[] printed = new boolean[256];

        System.out.print("Duplicate characters: ");

        for (int i = 0; i < chars.length; i++) {

            if (printed[chars[i]]) {
                continue; // already printed, skip
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[i] + " ");
                    printed[chars[i]] = true;
                    break;
                }
            }
        }
    }
}

