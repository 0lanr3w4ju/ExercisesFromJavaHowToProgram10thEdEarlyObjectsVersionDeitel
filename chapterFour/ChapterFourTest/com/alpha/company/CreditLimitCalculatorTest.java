package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {

    @Test
    void testForNewBalanceMethod() {
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setBalanceAtTheStartOfTheMonth(4);
        creditLimitCalculator.setTotalItemsChargedByCustomerInAMonth(1);
        creditLimitCalculator.setTotalCreditsAppliedToCustomerAccountInAMonth(1);
        assertEquals(4, creditLimitCalculator.newBalance());
    }

}