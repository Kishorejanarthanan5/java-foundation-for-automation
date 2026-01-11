package com.kishore.automation.methods;

public class CalculateDiscountMethod {
    public static void main(String[] args) {
    double discount = calculateDiscount(1000, "PREMIUM" );
        System.out.println("Discount Amount: " +discount);
    }
    static double calculateDiscount(double amount, String userType){
        if (userType.equals("PREMIUM"))
        {
            return amount * 0.10;
        }
        return amount;
    }
}
