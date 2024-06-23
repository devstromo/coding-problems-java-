package com.devstromo.medium.p673;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testFindNumberOfLIS() {
        assertEquals(2, solution.findNumberOfLIS(new int[]{1, 3, 5, 4, 7}));
        assertEquals(5, solution.findNumberOfLIS(new int[]{2, 2, 2, 2, 2}));
        assertEquals(1, solution.findNumberOfLIS(new int[]{1}));
    }

    @Test
    public void testFindNumberOfLISBestSolution() {
        assertEquals(2, solution.findNumberOfLISBestSolution(new int[]{1, 3, 5, 4, 7}));
        assertEquals(5, solution.findNumberOfLISBestSolution(new int[]{2, 2, 2, 2, 2}));
        assertEquals(1, solution.findNumberOfLISBestSolution(new int[]{1}));
    }
}