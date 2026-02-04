package com.kishore.automation.oops.constructors;

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        ParameterizedConstructorExample obj = new ParameterizedConstructorExample("chrome", 30);
        obj.displayConfig();
    }

    String browser;
    int timeout;

    public ParameterizedConstructorExample(String browser, int timeout) {
        this.browser = browser;
        this.timeout = timeout;
    }

    public void displayConfig() {
        System.out.println(browser + " - " + timeout);
    }
}
