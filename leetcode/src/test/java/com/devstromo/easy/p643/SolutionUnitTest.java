package com.devstromo.easy.p643;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();
    private final double tolerance = 1e-5;

    @Test
    public void testMaximumAvgSubarray() {
        assertEquals(12.75000, solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), tolerance);
        assertEquals(5.0000, solution.findMaxAverage(new int[]{5}, 1), tolerance);
    }

}