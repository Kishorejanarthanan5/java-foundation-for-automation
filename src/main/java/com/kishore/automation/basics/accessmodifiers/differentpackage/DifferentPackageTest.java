package com.kishore.automation.basics.accessmodifiers.differentpackage;
import com.kishore.automation.basics.accessmodifiers.samepackage.AccessExample;

public class DifferentPackageTest {
    public static void main(String[] args) {

        AccessExample obj = new AccessExample();

        System.out.println(obj.publicVar);

        // not accessible
        // System.out.println(obj.defaultVar);

        //not accessible (no inheritance)
        // System.out.println(obj.protectedVar);

        // not accessible
        // System.out.println(obj.privateVar);
    }
}
