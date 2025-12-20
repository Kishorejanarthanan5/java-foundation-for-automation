package com.kishore.automation.basics;
import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter User Name: ");
        String username  = data.nextLine();
        System.out.println("Enter User Name: ");
        String password = data.nextLine();

        if (username.equals("Admin") && password.equals("Admin123")){
            System.out.println("Logged in Successfully");
        } else
        {
            System.out.println("Invalid user name or password!");
        }

        data.close();
    }
}
