package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarPoolSavingsCalculatorTest {

    @Test
    public void testForCalculatingCostPerDayOfDriving() {
        CarPoolSavingsCalculator carPoolSavingsCalculator = new CarPoolSavingsCalculator();
        assertEquals(4240, carPoolSavingsCalculator.costPerDayOfDriving(200, 400, 20, 40, 200));
    }

}