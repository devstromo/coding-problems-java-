package com.devstromo.kyu7.LeapYears;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LeapYearsUnitTest {
    @Test
    public void testYear2020() {
        assertTrue(LeapYears.isLeapYear(2020));
    }

    @Test
    public void testYear2000() {
        assertTrue(LeapYears.isLeapYear(2000));
    }

    @Test
    public void testYear2015() {
        assertFalse(LeapYears.isLeapYear(2015));
    }

    @Test
    public void testYear2100() {
        assertFalse(LeapYears.isLeapYear(2100));
    }
}