package com.kishore.automation.oops.polymorphism.report;

public class ReportRunner {
    public static void main(String[] args) {
        Report report;

        report = new PdfReport();
        report.generate();

        report = new ExcelReport();
        report.generate();
    }
}
