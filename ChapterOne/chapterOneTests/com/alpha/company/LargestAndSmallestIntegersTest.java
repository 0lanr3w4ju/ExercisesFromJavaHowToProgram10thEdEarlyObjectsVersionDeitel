package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestAndSmallestIntegersTest {

    @Test
    public void testForLargestValue() {
        LargestAndSmallestIntegers largestAndSmallestIntegers = new LargestAndSmallestIntegers();
        assertEquals(9, largestAndSmallestIntegers.largestValue(1, 2, 9, 4, 5));
    }

    @Test
    public void testForSmallestValue() {
        LargestAndSmallestIntegers largestAndSmallestIntegers = new LargestAndSmallestIntegers();
        assertEquals(1, largestAndSmallestIntegers.smallestValue(1, 2, 9, 4, 5));
    }

}