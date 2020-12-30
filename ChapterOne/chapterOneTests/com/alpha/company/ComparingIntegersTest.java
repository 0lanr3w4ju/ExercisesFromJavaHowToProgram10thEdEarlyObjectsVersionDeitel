package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingIntegersTest {

    @Test
    public void testForLargerValue() {
        ComparingIntegers comparingIntegers = new ComparingIntegers();
        assertEquals(6, comparingIntegers.largerValue(6, 3));
    }

}