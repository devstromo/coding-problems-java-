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

    @Test
    public void testCalculateBellNumbersWithBellTriangleShouldReturnZero() {
        assertEquals(1, bellNumbers.calculateWithBellTriangle(0));
    }

    @Test
    public void testCalculateBellNumbersWithBellTriangleShouldReturnOne() {
        assertEquals(1, bellNumbers.calculateWithBellTriangle(1));
    }

    @Test
    public void testCalculateBellNumbersWithBellTriangleShouldReturnFive() {
        assertEquals(52, bellNumbers.calculateWithBellTriangle(5));
    }

    @Test
    public void testCalculateBellNumbersWithBellTriangleShouldReturnLargerValue() {
        assertEquals(203, bellNumbers.calculateWithBellTriangle(6));
    }

    @Test
    public void testCalculateBellNumbersWithBellTriangleShouldReturnTen() {
        assertEquals(115975, bellNumbers.calculateWithBellTriangle(10));
    }

    @Test
    public void testCalculateBellNumbersWith1DArrayShouldReturnZero() {
        assertEquals(1, bellNumbers.calculateWith1DArray(0));
    }

    @Test
    public void testCalculateBellNumbersWith1DArrayShouldReturnOne() {
        assertEquals(1, bellNumbers.calculateWith1DArray(1));
    }

    @Test
    public void testCalculateBellNumbersWith1DArrayShouldReturnFive() {
        assertEquals(52, bellNumbers.calculateWith1DArray(5));
    }

    @Test
    public void testCalculateBellNumbersWith1DArrayShouldReturnLargerValue() {
        assertEquals(203, bellNumbers.calculateWith1DArray(6));
    }

    @Test
    public void testCalculateBellNumbersWith1DArrayShouldReturnTen() {
        assertEquals(115975, bellNumbers.calculateWith1DArray(10));
    }

    @Test
    public void testMultiplicativePartitionsReturnFive() {
        assertEquals(5, bellNumbers.multiplicativePartitions(30));
    }
}