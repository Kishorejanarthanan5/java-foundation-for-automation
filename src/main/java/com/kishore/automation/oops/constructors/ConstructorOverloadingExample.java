package com.kishore.automation.oops.constructors;

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        ConstructorOverloadingExample obj1 =
                new ConstructorOverloadingExample();

        ConstructorOverloadingExample obj2 =
                new ConstructorOverloadingExample("UAT");

        System.out.println(obj1.env);
        System.out.println(obj2.env);
    }

    String env;

    public ConstructorOverloadingExample() {
        this.env = "QA";
    }

    public ConstructorOverloadingExample(String env) {
        this.env = env;
    }
}
