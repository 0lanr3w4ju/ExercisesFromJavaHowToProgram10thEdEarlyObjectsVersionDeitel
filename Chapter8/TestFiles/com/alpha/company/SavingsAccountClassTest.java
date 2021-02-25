package com.alpha.company;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountClassTest {
    @Test
    void setSavingsBalanceMethod() {
        SavingsAccountClass saver1 = new SavingsAccountClass();
        SavingsAccountClass saver2 = new SavingsAccountClass();
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);
        assertEquals(3000, saver2.getSavingsBalance());
        assertEquals(2000, saver1.getSavingsBalance());
    }

    @Test
    void calculateMonthlyInterestMethod() {
        SavingsAccountClass saver1 = new SavingsAccountClass();
        saver1.setSavingsBalance(2000);
        assertEquals(6.67, saver1.calculateMonthlyInterest());
    }

    @Test
    void modifyingInterestRateStaticMethod() {
        SavingsAccountClass saver1 = new SavingsAccountClass();
        SavingsAccountClass.modifyingInterestRate(5);
        assertEquals(0.05, SavingsAccountClass.annualInterestRate);
    }
}