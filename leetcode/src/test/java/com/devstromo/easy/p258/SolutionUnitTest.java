package com.devstromo.easy.p258;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    private final Solution addDigits = new Solution();

    @Test
    public void testAddDigitsExample1() {
        int num = 38;
        int expected = 2;
        assertEquals(expected, addDigits.addDigits(num));
    }

    @Test
    public void testAddDigitsExample2() {
        int num = 0;
        int expected = 0;
        assertEquals(expected, addDigits.addDigits(num));
    }

    @Test
    public void testAddDigitsLargeNumber() {
        int num = Integer.MAX_VALUE;
        int expected = 1;
        assertEquals(expected, addDigits.addDigits(num));
    }

    @Test
    public void testAddDigitsConstantExample1() {
        int num = 38;
        int expected = 2;
        assertEquals(expected, addDigits.addDigitsConstantTime(num));
    }

    @Test
    public void testAddDigitsConstantExample2() {
        int num = 0;
        int expected = 0;
        assertEquals(expected, addDigits.addDigitsConstantTime(num));
    }

    @Test
    public void testAddDigitsConstantLargeNumber() {
        int num = Integer.MAX_VALUE;
        int expected = 1;
        assertEquals(expected, addDigits.addDigitsConstantTime(num));
    }

    @Test
    public void testAddDigitsRecursiveExample1() {
        int num = 38;
        int expected = 2;
        assertEquals(expected, addDigits.addDigitsRecursive(num));
    }

    @Test
    public void testAddDigitsRecursiveExample2() {
        int num = 0;
        int expected = 0;
        assertEquals(expected, addDigits.addDigitsRecursive(num));
    }

    @Test
    public void testAddDigitsRecursiveLargeNumber() {
        int num = Integer.MAX_VALUE;
        int expected = 1;
        assertEquals(expected, addDigits.addDigitsRecursive(num));
    }
}