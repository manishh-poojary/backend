package com.learning.backend;

public class BankAccount {

    int balance;
    String ownerName;
    String accountNumber;
    double roi;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Balance: " + balance);
        System.out.println("Customer Name: " + ownerName);

    }

    void withdraw(double amount) {
        if (balance > 0 && balance - amount > 0) {
            balance -= amount;
            System.out.println(" Current Balance: " + balance);
        } else {
            System.out.println(" Insufficient Balance");
        }
    }

    void currentBalance() {
        System.out.println(" Current Balance is " + this.balance);
    }

    double getSimpleInterest(int years) {
        double result = 0.0;
        if (years > 0) {
            result = (roi * years * balance) / 100;
        }
        return result;
    }

    double getBalanceWithInterest(int years) {
        double result = 0.0;
        if (years > 0) {
            result = balance * getSimpleInterest(years);
        }
        return result;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.balance = 100;
        bank.roi = 9.5;

        System.out.println(bank.getBalanceWithInterest(10));
    }
}
