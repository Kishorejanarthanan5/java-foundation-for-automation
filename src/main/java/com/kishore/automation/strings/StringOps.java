package com.kishore.automation.strings;

public class StringOps {
    public static void main(String[] args) {
        String data = "QA, Automation , SDET";

        String[] parts = data.split("\\s*,\\s*");
        for (String p : parts) {
            System.out.println(p);
        }

        System.out.println(data.contains("Automation"));
        System.out.println(data.replace(" ", ""));
    }
}
