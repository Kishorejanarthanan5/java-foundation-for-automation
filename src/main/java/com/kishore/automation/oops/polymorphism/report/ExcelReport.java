package com.kishore.automation.oops.polymorphism.report;

public class ExcelReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating Excel report");
    }
}
