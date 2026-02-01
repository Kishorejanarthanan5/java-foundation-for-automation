package com.kishore.automation.oops.abstraction.payment;

public class PaymentExampleAbst {
    public static void main(String[] args) {
        Payment payment;   // interface reference

        payment = new CreditCardPayment();  // point to CC
        payment.pay(100);

        payment = new UpiPayment();         // point to UPI
        payment.pay(200);

        payment = new NetBankingPayment();         // point to UPI
        payment.pay(500);
    }
}

    class CreditCardPayment implements Payment {
        @Override
        public void pay(int amount) {
            System.out.println("Credit Card Payment: " + amount);
        }
    }

    class UpiPayment implements Payment {
        @Override
        public void pay(int amount) {
            System.out.println("UPI Payment: " + amount);
        }
    }
    class NetBankingPayment implements Payment {
        @Override
        public void pay(int amount) {
            System.out.println("Net Banking Payment: " + amount);
         }
    }
