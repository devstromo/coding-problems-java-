package com.devstromo.day241;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProblemTest {

    private final Problem problem = new Problem();

    @Test
    public void testHIndex3() {
        Integer[] citations = new Integer[] { 3, 5, 3, 8, 25 };
        int hIndex = problem.solve(citations);
        assertEquals(3, hIndex);
    }

    @Test
    public void testHIndex4() {
        Integer[] citations = new Integer[] { 3, 4, 8, 5, 10 };
        int hIndex = problem.solve(citations);
        assertEquals(4, hIndex);
    }

    @Test
    public void testHIndex7() {
        Integer[] citations = new Integer[] { 50, 40, 33, 23, 12, 11, 8, 5, 1, 0 };
        int hIndex = problem.solve(citations);
        assertEquals(7, hIndex);
    }

    @Test
    public void testHIndex1() {
        Integer[] citations = new Integer[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int hIndex = problem.solve(citations);
        assertEquals(1, hIndex);
    }
}