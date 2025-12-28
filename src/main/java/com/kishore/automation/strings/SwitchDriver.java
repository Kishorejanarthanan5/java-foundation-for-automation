package com.kishore.automation.strings;
import java.util.Scanner;

public class SwitchDriver {
         public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Browser name: ");
            String browser = scan.nextLine().toLowerCase();
             if (!browser.equals("chrome") && !browser.equals("firefox") && !browser.equals("edge"))  {
                System.out.println("Enter a valid Browser name!");
            }
            else
            {
                switch (browser) {
                    case "chrome":
                        System.out.println("Chrome browser open successfully");
                        break;
                    case "firefox":
                        System.out.println("Firefox browser open successfully");
                        break;
                    case "edge":
                        System.out.println("Edge browser open successfully");
                        break;
                }
            }
            scan.close();
        }
    }

