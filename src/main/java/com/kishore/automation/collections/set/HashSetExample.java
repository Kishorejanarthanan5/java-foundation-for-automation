package com.kishore.automation.collections.set;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> actualUsers = new HashSet<>();
        actualUsers.add("admin");
        actualUsers.add("tester");
        actualUsers.add("guest");

        if (actualUsers.contains("admin")) {
            System.out.println("Admin user exists");
        } else {
            System.out.println("Admin missing");
        }
    }
}