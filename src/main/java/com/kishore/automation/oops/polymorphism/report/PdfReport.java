package com.kishore.automation.oops.polymorphism.report;

public class PdfReport implements Report
{
    @Override
    public void generate() {
        System.out.println("Generating PDF report");
    }
}
