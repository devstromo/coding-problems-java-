package com.devstromo.medium.p1696;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();


    @Test
    public void testJumpGame6() {
        assertEquals(7, solution.maxResult(new int[]{1, -1, -2, 4, -7, 3}, 2));
        assertEquals(17, solution.maxResult(new int[]{10, -5, -2, 4, 0, 3}, 3));
        assertEquals(0, solution.maxResult(new int[]{1, -5, -20, 4, -1, 3, -6, -3}, 2));
    }

    @Test
    public void testJumpGame6Optimized() {
        assertEquals(7, solution.maxResultOptimized(new int[]{1, -1, -2, 4, -7, 3}, 2));
        assertEquals(17, solution.maxResultOptimized(new int[]{10, -5, -2, 4, 0, 3}, 3));
        assertEquals(0, solution.maxResultOptimized(new int[]{1, -5, -20, 4, -1, 3, -6, -3}, 2));
    }

    @Test
    public void testJumpGame6BestSolution() {
        assertEquals(7, solution.maxResultBestSolution(new int[]{1, -1, -2, 4, -7, 3}, 2));
        assertEquals(17, solution.maxResultBestSolution(new int[]{10, -5, -2, 4, 0, 3}, 3));
        assertEquals(0, solution.maxResultBestSolution(new int[]{1, -5, -20, 4, -1, 3, -6, -3}, 2));
    }

}