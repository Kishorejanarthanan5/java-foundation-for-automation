package com.kishore.automation.collections.list;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> testCases = new ArrayList<>();

        testCases.add("LoginTest");
        testCases.add("SearchTest");
        testCases.add("CheckoutTest");

        for (String test : testCases) {
            System.out.println("Executing: " + test);
        }
    }
}