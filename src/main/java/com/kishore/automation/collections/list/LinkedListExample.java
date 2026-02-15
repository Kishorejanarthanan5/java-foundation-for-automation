package com.kishore.automation.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<String> steps = new LinkedList<>();

        steps.add("Open Browser");
        steps.add("Enter Credentials");

        steps.add(1, "Navigate to Login Page"); // insert in middle

        for (String step : steps) {
            System.out.println(step);
        }
    }
}
