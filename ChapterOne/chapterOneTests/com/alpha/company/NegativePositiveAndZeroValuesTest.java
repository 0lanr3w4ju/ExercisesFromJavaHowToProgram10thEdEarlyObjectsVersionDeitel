package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativePositiveAndZeroValuesTest {

    @Test
    public void testForNegativeNumbers() {
        NegativePositiveAndZeroValues negativePositiveAndZeroValues = new NegativePositiveAndZeroValues();
        assertEquals(1, negativePositiveAndZeroValues.negativePositiveAndZeroCounter(-8));
    }

}