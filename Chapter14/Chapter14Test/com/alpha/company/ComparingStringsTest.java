package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingStringsTest {
    @Test
    void compareStrings() {
        ComparingStrings comparingStrings = new ComparingStrings();
        comparingStrings.firstStringValue = "hello ";
        comparingStrings.secondStringValue = "hello";
        int report = comparingStrings.firstStringValue.compareTo(comparingStrings.secondStringValue);
        assertNotEquals(0, report);
    }
}