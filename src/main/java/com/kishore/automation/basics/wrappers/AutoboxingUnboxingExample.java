package com.kishore.automation.basics.wrappers;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {

        int count = 5;
        //Java does this automatically — but null causes crash
        Integer boxed = count;   // autoboxing
        int unboxed = boxed;     // unboxing
        System.out.println(boxed);
        System.out.println(unboxed);

        //NullPointerRiskExample
        Integer retryCount = null;
        if (retryCount != null) {
            int value = retryCount;
            System.out.println(value);
        } else {
            System.out.println("Retry count not configured");
        }
    }
}
