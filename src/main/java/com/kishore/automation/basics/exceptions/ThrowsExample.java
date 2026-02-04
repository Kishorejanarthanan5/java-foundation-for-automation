package com.kishore.automation.basics.exceptions;

public class ThrowsExample {
    public static void main(String[] args) {

        try{
            readFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void readFile() throws Exception {
        throw new Exception("File not Found");
    }
}
