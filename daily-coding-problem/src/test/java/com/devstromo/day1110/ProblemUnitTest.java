package com.devstromo.day1110;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemUnitTest {
    private final Problem problem = new Problem();

    @Test
    void testSimpleTriplet() {
        assertTrue(problem.solve(new int[]{3, 4, 5}));
    }

    @Test
    void testMultipleTriplets() {
        assertTrue(problem.solve(new int[]{10, 4, 6, 8, 5}));
    }

    @Test
    void testNoTriplet() {
        assertFalse(problem.solve(new int[]{1, 2, 3}));
    }

    @Test
    void testEmptyArray() {
        assertFalse(problem.solve(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertFalse(problem.solve(new int[]{5}));
    }

    @Test
    void testOnlyTwoElements() {
        assertFalse(problem.solve(new int[]{5, 12}));
    }

    @Test
    void testWithDuplicates() {
        assertTrue(problem.solve(new int[]{5, 5, 3, 4}));
    }

    @Test
    void testWithZeros() {
        assertFalse(problem.solve(new int[]{0, 0, 0}));
    }

    @Test
    void testNegativeNumbers() {
        assertTrue(problem.solve(new int[]{-3, 4, 5}));
        assertTrue(problem.solve(new int[]{3, -4, 5}));
        assertTrue(problem.solve(new int[]{3, 4, -5}));
    }

    @Test
    void testLargeTriplet() {
        assertTrue(problem.solve(new int[]{9, 40, 41}));
    }
}