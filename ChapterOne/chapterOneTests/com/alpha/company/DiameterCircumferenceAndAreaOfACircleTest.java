package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterCircumferenceAndAreaOfACircleTest {

    @Test
    public void testForCircleDiameter() {
        DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
        assertEquals(8, diameterCircumferenceAndAreaOfACircle.diameter(4));
    }

    @Test
    public void testForCircleCircumference() {
        DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
        assertEquals(25.132741928100586, diameterCircumferenceAndAreaOfACircle.circumference(4));
    }

    @Test
    public void testForArea() {
        DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
        assertEquals(50.26548385620117, diameterCircumferenceAndAreaOfACircle.area(4));
    }

}