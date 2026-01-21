package com.kishore.automation.strings;

public class StringBufferBasicExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Automation");
        sb.insert(4, " Test");
        sb.replace(0, 4, "SDET");
        sb.delete(4, 9);

        System.out.println(sb);
    }
}
