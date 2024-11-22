package com.devstromo.easy.p697;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testFindShortestSubArray() {
        assertEquals(2, solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        assertEquals(6, solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
        assertEquals(1, solution.findShortestSubArray(new int[]{1}));
    }

}