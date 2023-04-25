package com.devstromo.day311;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProblemTest {

    @Test
    public void testPeak() {
        assertEquals(2, Problem.solve(new int[] { 1, 3, 20, 4, 1, 0 }));
        assertEquals(0, Problem.solve(new int[] { 5, 3, 2, 1, 0 }));
        assertEquals(0, Problem.solve(new int[] { 100 }));
        assertEquals(-1, Problem.solve(new int[] { }));
    }

}