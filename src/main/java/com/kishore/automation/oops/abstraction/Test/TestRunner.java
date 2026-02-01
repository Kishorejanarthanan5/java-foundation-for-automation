package com.kishore.automation.oops.abstraction.Test;

public class TestRunner {
    public static void main(String[] args) {
    BaseTest test;

    test = new WebTest();
    test.runTest();

        System.out.println("----------------------");

    test = new ApiTest();
    test.runTest();
}
}
    class ApiTest extends BaseTest {
    @Override
    protected void executeTest() {
        System.out.println("Executing API test");
    }
    }

    class WebTest extends BaseTest {
    @Override
    protected void executeTest() {
        System.out.println("Executing Web UI test");
    }
    }
