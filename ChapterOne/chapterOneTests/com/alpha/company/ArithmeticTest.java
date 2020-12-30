package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {

    @Test
    public void testForSum() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(10, arithmetic.sum(5, 5));
    }

    @Test
    public void testForProduct() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(10, arithmetic.product(5, 2));
    }

    @Test
    public void testForDifference() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(10, arithmetic.difference(20, 10));
    }

    @Test
    public void testForQuotient() {
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(4, arithmetic.quotient(20, 5));
    }

}