package com.kishore.automation.oops.inheritance;

public class EmployeeRunner {
    public static void main(String[] args) {

        FullTimeEmployee emp = new FullTimeEmployee("Kishore");
        emp.work();       // inherited
        emp.getSalary();  // own
    }
}
