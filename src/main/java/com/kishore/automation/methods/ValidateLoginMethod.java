package com.kishore.automation.methods;

public class ValidateLoginMethod {
    public static void main(String[] args) {
        boolean result = verifyLogin("admin", "admin123");
        if(result)
        {
            System.out.println("Login Success");
        } else {
            System.out.println("Invalid User name or password");
        }
    }
    static boolean verifyLogin(String userName, String passCode){
        return userName.equals("admin") && passCode.equals("admin123");
    }
}
