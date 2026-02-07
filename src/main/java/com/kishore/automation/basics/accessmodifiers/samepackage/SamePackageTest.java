package com.kishore.automation.basics.accessmodifiers.samepackage;

public class SamePackageTest {

    public static void main(String[] args) {

        AccessExample obj = new AccessExample();

        System.out.println(obj.publicVar);
        // System.out.println(obj.privateVar); // not accessible
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
    }
}