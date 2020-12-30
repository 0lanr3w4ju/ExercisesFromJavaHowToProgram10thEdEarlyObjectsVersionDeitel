package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSmallestAndLargestTest {

    @Test
    public void testForSum() {
        ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
        assertEquals(3, arithmeticSmallestAndLargest.sum(1, 1, 1));
    }

    @Test
    public void testForAverage() {
        ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
        assertEquals(2, arithmeticSmallestAndLargest.sum(1, 2, 3)/3);
    }

    @Test
    public void testForProduct() {
        ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
        assertEquals(6, arithmeticSmallestAndLargest.product(1, 2, 3));
    }

    @Test
    public void testForSmallestValue() {
        ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
        assertEquals(1, arithmeticSmallestAndLargest.smallestValue(1, 2, 3));
    }

    @Test
    public void testForLargestValue() {
        ArithmeticSmallestAndLargest arithmeticSmallestAndLargest = new ArithmeticSmallestAndLargest();
        assertEquals(3, arithmeticSmallestAndLargest.largestValue(1, 2, 3));
    }

}