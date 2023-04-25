package com.devstromo.day225;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProblemTest {
    private final Problem problem = new Problem();

    @Test
    public void testJosephusProblemForK3() {
        int result = problem.solve(41, 3);
        assertEquals(31, result);
    }

    @Test
    public void testJosephusProblemForK2() {
        int result = problem.solve(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void testJosephusProblemForK9() {
        int result = problem.solve(30, 9);
        assertEquals(21, result);
    }
}