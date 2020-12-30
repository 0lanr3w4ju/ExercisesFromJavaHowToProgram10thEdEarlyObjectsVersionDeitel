package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldPopulationGrowthCalculatorTest {

    @Test
    public void testForRateOfIncreaseDividedByOneHundred() {
        WorldPopulationGrowthCalculator worldPopulationGrowthCalculator = new WorldPopulationGrowthCalculator();
        assertEquals(0.011, worldPopulationGrowthCalculator.rateOfIncrease(1.1));
    }

    @Test
    public void testForRateOfIncreaseMultipliedByTimePeriodInvolved() {
        WorldPopulationGrowthCalculator worldPopulationGrowthCalculator = new WorldPopulationGrowthCalculator();
        assertEquals(0.022, worldPopulationGrowthCalculator.rateOfIncreaseByTimePeriodInvolved(0.011, 2));
    }

    @Test
    public void testForBaseOfNaturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved() {
        WorldPopulationGrowthCalculator worldPopulationGrowthCalculator = new WorldPopulationGrowthCalculator();
        assertEquals(1.022, worldPopulationGrowthCalculator.naturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved(0.022));
    }

    @Test
    public void testForPopulationByBaseOfNaturalLogarithms() {
        WorldPopulationGrowthCalculator worldPopulationGrowthCalculator = new WorldPopulationGrowthCalculator();
        assertEquals(8.00737, worldPopulationGrowthCalculator.populationByBaseOfNaturalLogarithms(7.835, 1.022));
    }

}