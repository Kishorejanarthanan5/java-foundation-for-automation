package com.kishore.automation.oops.inheritance.employee;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name) {
        super(name);
    }

    public void getSalary() {
        System.out.println(name + " receives monthly salary");
    }
}
