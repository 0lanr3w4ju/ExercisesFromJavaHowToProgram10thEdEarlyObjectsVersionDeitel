package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void setMonth() {
        Date date = new Date();
        date.setMonth(13);
        assertEquals(1, date.getMonth());
    }

    @Test
    void setDay() {
        Date date = new Date();
        date.setMonth(13);
        date.setDay(29);
        assertEquals(29, date.getDay());
    }

    @Test
    void setYear() {
        Date date = new Date();
        date.setYear(1994);
        assertEquals(2021, date.getYear());
    }

}