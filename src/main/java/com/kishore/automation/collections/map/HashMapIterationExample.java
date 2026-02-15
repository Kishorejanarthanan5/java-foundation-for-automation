package com.kishore.automation.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterationExample {

    public static void main(String[] args) {

        Map<String, Integer> responseCodes = new HashMap<>();

        responseCodes.put("LoginAPI", 200);
        responseCodes.put("SearchAPI", 500);

        for (Map.Entry<String, Integer> entry : responseCodes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
