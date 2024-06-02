package com.devstromo.hard.p1573;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testMinimumCostCutStick() {
        assertEquals(16, solution.minCost(7, new int[]{1, 3, 4, 5}));
        assertEquals(22, solution.minCost(9, new int[]{5, 6, 1, 4, 2}));
    }

}