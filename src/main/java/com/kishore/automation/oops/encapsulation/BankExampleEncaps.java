package com.kishore.automation.oops.encapsulation;

public class BankExampleEncaps {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        // Deposit money
        account1.deposit(1000);
        System.out.println("Account1 Balance: " + account1.getBalance());

        // Withdraw money
        account1.withdraw(300);
        System.out.println("Account1 Balance after withdrawal: " + account1.getBalance());

        // Transfer money
        account1.transfer(account2, 400);

        System.out.println("Account1 Balance after transfer: " + account1.getBalance());
        System.out.println("Account2 Balance after receiving transfer: " + account2.getBalance());
    }
}

class BankAccount {

    private int balance = 0;

    // Deposit money
    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0");
        }
        balance += amount;
    }

    // Withdraw money
    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be greater than 0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    // Transfer money to another account
    public void transfer(BankAccount to, int amount) {
        if (to == null) {
            throw new IllegalArgumentException("Target account cannot be null");
        }

        this.withdraw(amount);   // reuse validation + logic
        to.deposit(amount);      // reuse validation + logic
    }

    // Read-only access to balance
    public int getBalance() {
        return balance;
    }
}

