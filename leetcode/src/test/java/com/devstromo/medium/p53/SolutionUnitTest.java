package com.devstromo.medium.p53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void maxSubArray() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, solution.maxSubArray(new int[]{1}));
        assertEquals(23, solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

    @Test
    public void maxSubArrayBest() {
        assertEquals(6, solution.maxSubArrayBest(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, solution.maxSubArrayBest(new int[]{1}));
        assertEquals(23, solution.maxSubArrayBest(new int[]{5, 4, -1, 7, 8}));
    }

}