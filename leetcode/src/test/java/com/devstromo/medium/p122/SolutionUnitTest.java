package com.devstromo.medium.p122;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testMaxProfitII() {
        assertEquals(7, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void testMaxProfitIIBest() {
        assertEquals(7, solution.maxProfitBest(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, solution.maxProfitBest(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, solution.maxProfitBest(new int[]{7, 6, 4, 3, 1}));
    }

}