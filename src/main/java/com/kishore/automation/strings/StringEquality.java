package com.kishore.automation.strings;

public class StringEquality {
    public static void main(String[] args) {

        String s1 = "automation";
        String s2 = "automation";
        String s3 = new String("automation");

        System.out.println(s1 == s2);       // true (same reference from string pool)
        System.out.println(s1 == s3);       // false (different object)
        System.out.println(s1.equals(s3));  // true (content comparison)
    }
}
