package com.kishore.automation.strings;

public class RegexBasics {
    public static void main(String[] args) {
        String input = "User_123 logged in";

        System.out.println(input.matches(".*\\d+.*")); // digits
        System.out.println(input.replaceAll("\\s+", "_")); // whitespace
        System.out.println(input.replaceAll("\\w", "*")); // word chars
    }
}
