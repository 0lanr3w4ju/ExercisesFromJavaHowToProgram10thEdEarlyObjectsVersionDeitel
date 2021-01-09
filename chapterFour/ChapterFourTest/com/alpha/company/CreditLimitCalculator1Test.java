package com.alpha.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculator1Test {

    CreditLimitCalculator1 creditLimitCalculator1;

    @BeforeEach
    void start() {
        creditLimitCalculator1 = new CreditLimitCalculator1(100, 200, 300, 400, 500);
    }

    @AfterEach
    void end() {
        creditLimitCalculator1 = null;
    }

    @Test
    void testForInputsToBeIntegers() {
        assertEquals(100, creditLimitCalculator1.getAccountNumber());
        assertEquals(200, creditLimitCalculator1.getBalanceAtTheStartOfTheMonth());
        assertEquals(300, creditLimitCalculator1.getTotalItemsChargedByCustomerInAMonth());
        assertEquals(400, creditLimitCalculator1.getTotalCreditsAppliedToCustomerAccountInAMonth());
    }

    @Test
    void testForNewBalanceMethod() {
        assertEquals(100, creditLimitCalculator1.newBalance());
    }

    @Test
    void testToDetermineWhetherTheNewBalanceExceedsTheCustomerCreditLimitOrNot() {
        assertFalse(creditLimitCalculator1.newBalance() > creditLimitCalculator1.getCreditLimit());
    }

    @Test
    void testToDisplayMessage() {
        assertEquals("within credit limit", creditLimitCalculator1.displayMessage());
    }

    @Test
    void testToDisplayMessage2() {
        creditLimitCalculator1 = new CreditLimitCalculator1(100, 200, 300, 400, 99);
        assertEquals("credit limit exceeded", creditLimitCalculator1.displayMessage());
    }
}