package com.kishore.automation.basics.accessmodifiers.samepackage;

public class AccessExample {
    public int publicVar = 10;
    private int privateVar = 20;
    int defaultVar = 30;
    protected int protectedVar = 40;

    public void printValues() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
    }
}
