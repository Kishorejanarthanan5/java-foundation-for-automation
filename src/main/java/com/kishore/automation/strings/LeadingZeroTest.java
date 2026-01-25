package com.kishore.automation.strings;

public class LeadingZeroTest {
    public static void main(String[] args) {
        String[] tests = {"00123", "000", "0", "045", "100"};

        for (String id : tests) {
            System.out.println(id + " -> " +
                    id.replaceFirst("^0+(?!$)", ""));
        }
    }
}
