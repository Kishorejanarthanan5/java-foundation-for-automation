package com.kishore.automation.oops.abstraction.Test;

/* Abstract base class defining test execution flow.
   Contains common behavior + abstract steps.  */
public abstract class BaseTest {

    // Template method (fixed flow)
    public void runTest() {
        setup();
        executeTest();
    }

    // Common behavior
    protected void setup() {
        System.out.println("Setting up test environment");
    }

    // Abstract method (to be implemented by subclasses)
    protected abstract void executeTest();
}
