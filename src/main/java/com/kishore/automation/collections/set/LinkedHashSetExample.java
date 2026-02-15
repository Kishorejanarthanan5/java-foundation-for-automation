package com.kishore.automation.collections.set;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        Set<String> steps = new LinkedHashSet<>();

        steps.add("Login");
        steps.add("Search");
        steps.add("Checkout");
        steps.add("Login"); // duplicate

        System.out.println(steps);
    }
}
