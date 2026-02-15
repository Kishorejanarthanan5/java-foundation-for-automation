package com.kishore.automation.collections.map;
import java.util.HashMap;
import java.util.Map;

public class HashMapBasicExample {

    public static void main(String[] args) {

        Map<String, String> userData = new HashMap<>();

        userData.put("username", "admin");
        userData.put("role", "tester");
        userData.put("status", "active");

        System.out.println(userData.get("username"));
        System.out.println(userData.containsKey("role"));
    }
}
