package com.alpha.company;

import javax.swing.*;

public class Account {
/*
    an Account class that provides a method called withdraw that withdraws
    money from an Account. withdrawal amount can not exceed the Account’s balance.
    If it does, the balance would be left unchanged and the method would print
    a message indicating "Withdrawal amount exceeded account balance."
*/

    //class variables
    private final String name;
    private double balance;

    //class constructor
    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    //class methods
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if ((amount > 0.0) && (amount <= balance)) {
            this.balance -= amount;
        } else JOptionPane.showMessageDialog(null, "Withdrawal amount exceeded account balance.");
    }

}
