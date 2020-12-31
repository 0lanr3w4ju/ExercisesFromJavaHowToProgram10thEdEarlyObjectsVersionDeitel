package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testForConstructorBalance() {
        Account account = new Account("lanre", 500_000);
        assertEquals(500_000, account.getBalance());
    }

    @Test
    public void testForDeposit() {
        Account account = new Account("lanre", 500_000);
        account.deposit(500_000);
        assertEquals(1_000_000, account.getBalance());
    }

    @Test
    public void testForWithdraw() {
        Account account = new Account("lanre", 500_000);
        account.withdraw(200_000);
        assertEquals(300_000, account.getBalance());
    }

}