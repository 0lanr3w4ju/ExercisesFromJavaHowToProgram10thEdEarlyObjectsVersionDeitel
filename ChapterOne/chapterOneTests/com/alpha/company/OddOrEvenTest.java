package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOrEvenTest {

    @Test
    public void testForOddOrEven() {
        OddOrEven oddOrEven = new OddOrEven();
        assertEquals(1, oddOrEven.oddOrEven(100));
    }

}