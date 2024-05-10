package com.devstromo.dp.bell_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BellNumbersUnitTest {

    private final BellNumbers bellNumbers = new BellNumbers();

    @Test
    public void testCalculateBellNumbersShouldReturnZero() {
        assertEquals(1, bellNumbers.calculate(0));
    }

    @Test
    public void testCalculateBellNumbersShouldReturnOne() {
        assertEquals(1, bellNumbers.calculate(1));
    }

    @Test
    public void testCalculateBellNumbersShouldReturnFive() {
        assertEquals(52, bellNumbers.calculate(5));
    }

    @Test
    public void testCalculateBellNumbersShouldReturnLargerValue() {
        assertEquals(203, bellNumbers.calculate(6));
    }

    @Test
    public void testCalculateBellNumbersShouldReturnTen() {
        assertEquals(115975, bellNumbers.calculate(10));
    }
}