package com.kishore.automation.strings;

public class StringBuilderBasicExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Test");

        sb.append(" Automation");
        sb.insert(4, " Case");
        sb.reverse();

        System.out.println(sb);
    }
}
