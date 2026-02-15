package com.kishore.automation.collections.list;
import java.util.ArrayList;
import java.util.List;
public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> browsers = new ArrayList<>();

        browsers.add("chrome");
        browsers.add("firefox");
        browsers.add("edge");
        browsers.remove("edge");
        System.out.println("First browser: " + browsers.get(0));
        System.out.println("Total count: " + browsers.size());
        System.out.println("Contains chrome? " + browsers.contains("chrome"));
        browsers.clear();
        System.out.println("After clear: " + browsers.size());
    }
}
