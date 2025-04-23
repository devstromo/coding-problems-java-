package com.devstromo.day1110;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemUnitTest {
    private final Problem problem = new Problem();

    @Test
    @DisplayName("Test Pythagorean triplet")
    void testPythagoreanTriplet() {
        assertFalse(problem.solve(new int[]{0, 0, 0}));
        assertFalse(problem.solve(new int[]{1, 2, 3}));
        assertFalse(problem.solve(new int[]{5, 12}));
        assertFalse(problem.solve(new int[]{5}));
        assertFalse(problem.solve(new int[]{}));
        assertTrue(problem.solve(new int[]{-3, 4, 5}));
        assertTrue(problem.solve(new int[]{10, 4, 6, 8, 5}));
        assertTrue(problem.solve(new int[]{3, -4, 5}));
        assertTrue(problem.solve(new int[]{3, 4, -5}));
        assertTrue(problem.solve(new int[]{3, 4, 5}));
        assertTrue(problem.solve(new int[]{5, 5, 3, 4}));
        assertTrue(problem.solve(new int[]{9, 40, 41}));
    }

    @Test
    @DisplayName("Test Pythagorean triplet with two pointers")
    void testPythagoreanTripletWithTwoPointers() {
        assertFalse(problem.solveTwoPointers(new int[]{0, 0, 0}));
        assertFalse(problem.solveTwoPointers(new int[]{1, 2, 3}));
        assertFalse(problem.solveTwoPointers(new int[]{5, 12}));
        assertFalse(problem.solveTwoPointers(new int[]{5}));
        assertFalse(problem.solveTwoPointers(new int[]{}));
        assertTrue(problem.solveTwoPointers(new int[]{-3, 4, 5}));
        assertTrue(problem.solveTwoPointers(new int[]{10, 4, 6, 8, 5}));
        assertTrue(problem.solveTwoPointers(new int[]{3, -4, 5}));
        assertTrue(problem.solveTwoPointers(new int[]{3, 4, -5}));
        assertTrue(problem.solveTwoPointers(new int[]{3, 4, 5}));
        assertTrue(problem.solveTwoPointers(new int[]{5, 5, 3, 4}));
        assertTrue(problem.solveTwoPointers(new int[]{9, 40, 41}));
    }

}