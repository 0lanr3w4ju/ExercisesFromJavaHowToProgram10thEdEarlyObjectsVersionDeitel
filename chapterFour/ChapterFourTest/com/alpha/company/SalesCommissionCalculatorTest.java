package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {

    @Test
    void testForInputOfItemShouldBeInteger() {
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        assertEquals(4, salesCommissionCalculator.items(4));
    }

    @Test
    void testForItemIsEqualsTheExpectedValue() {
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        assertEquals(99.95, salesCommissionCalculator.itemsValues(3));
    }

    @Test
    void testForMethodThatCalculatesSalesPersonsEarnings() {
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        assertEquals(650.0, salesCommissionCalculator.calculatesSalesPersonEarnings(5000));
    }

}