package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheLargestNumberTest {

    @Test
    void testForSetLargestNumber() {
        FindTheLargestNumber findTheLargestNumber = new FindTheLargestNumber();
        findTheLargestNumber.setLargest(5);
        assertEquals(5, findTheLargestNumber.getLargest());
    }

    @Test
    void testForDeterminingLargestNumber() {
        FindTheLargestNumber findTheLargestNumber = new FindTheLargestNumber();
        findTheLargestNumber.setLargest(9);
        findTheLargestNumber.findLargestNumberMethod(3);
        assertEquals(9, findTheLargestNumber.getLargest());
    }

}