package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {

    @Test
    public void testForNewBalanceMethod() {
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setCreditLimit(0);
        creditLimitCalculator.setBalanceAtTheStartOfTheMonth(1);
        creditLimitCalculator.setTotalItemsChargedByCustomerInAMonth(1);
        creditLimitCalculator.setTotalCreditsAppliedToCustomerAccountInAMonth(1);
        assertEquals(1, creditLimitCalculator.newBalance());
    }

}