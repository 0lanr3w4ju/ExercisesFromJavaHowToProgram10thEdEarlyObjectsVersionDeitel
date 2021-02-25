package com.alpha.company;

import java.text.DecimalFormat;

public class SavingsAccountClass {
    static double annualInterestRate;

    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double amount) {
        this.savingsBalance = amount;
    }

    public double calculateMonthlyInterest() {
        double result = (getSavingsBalance() * annualInterestRate) / 12;
        DecimalFormat df = new DecimalFormat("#.##");
        result = Double.parseDouble(df.format(result));
        return result;
    }

    public static void modifyingInterestRate(double interestRate) {
        interestRate = interestRate / 100.0;
        annualInterestRate = interestRate;
    }
}