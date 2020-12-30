package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {

    @Test
    public void testForOddOrEven() {
        Multiples multiples = new Multiples();
        assertEquals(2, multiples.oddOrEven(10, 5));
    }

}