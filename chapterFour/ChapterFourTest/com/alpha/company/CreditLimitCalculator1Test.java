package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculator1Test {

    @Test
    void testForInputsToBeIntegers() {
        CreditLimitCalculator1 creditLimitCalculator1 = new CreditLimitCalculator1(100, 200, 300, 400, 500);
        assertEquals(100, creditLimitCalculator1.getAccountNumber());
        assertEquals(200, creditLimitCalculator1.getBalanceAtTheStartOfTheMonth());
        assertEquals(300, creditLimitCalculator1.getTotalItemsChargedByCustomerInAMonth());
        assertEquals(400, creditLimitCalculator1.getTotalCreditsAppliedToCustomerAccountInAMonth());
    }

    @Test
    void testForNewBalanceMethod() {
        CreditLimitCalculator1 creditLimitCalculator1 = new CreditLimitCalculator1(100, 200, 300, 400, 500);
        assertEquals(100, creditLimitCalculator1.newBalance());
    }

    @Test
    void testToDetermineWhetherTheNewBalanceExceedsTheCustomerCreditLimitOrNot() {
        CreditLimitCalculator1 creditLimitCalculator1 = new CreditLimitCalculator1(100, 200, 300, 400, 500);
        assertFalse(creditLimitCalculator1.newBalance() > creditLimitCalculator1.getCreditLimit());
    }

    @Test
    void testToDisplayMessage() {
        CreditLimitCalculator1 creditLimitCalculator1 = new CreditLimitCalculator1(100, 200, 300, 400, 500);
        assertEquals("within credit limit", creditLimitCalculator1.diplayMessage());
    }

}