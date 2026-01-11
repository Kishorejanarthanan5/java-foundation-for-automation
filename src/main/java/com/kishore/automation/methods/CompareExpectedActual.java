package com.kishore.automation.methods;

public class CompareExpectedActual {
    public static void main(String[] args) {
        String result = compareValues("SUCCESS", "SUCCESS");
        System.out.println(result);
    }

    static String compareValues(String expected, String actual) {
        if (actual.equals(expected)) {
            return "PASS";
        }
        return "FAIL";
    }
}
