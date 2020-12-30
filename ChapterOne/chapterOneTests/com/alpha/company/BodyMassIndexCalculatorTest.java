package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexCalculatorTest {

    @Test
    public void testForWeightInPounds() {
        BodyMassIndexCalculator bodyMassIndexCalculator = new BodyMassIndexCalculator();
        assertEquals(26.46, bodyMassIndexCalculator.weightInPounds(12));
    }

    @Test
    public void testForHeightInInches() {
        BodyMassIndexCalculator bodyMassIndexCalculator = new BodyMassIndexCalculator();
        assertEquals(71, bodyMassIndexCalculator.heightInInches(5, 11));
    }

    @Test
    public void testForBodyMassIndexCalculator() {
        BodyMassIndexCalculator bodyMassIndexCalculator = new BodyMassIndexCalculator();
        assertEquals(8.073515625, bodyMassIndexCalculator.bodyMassIndexCalculator(26.46, 48));
    }

}