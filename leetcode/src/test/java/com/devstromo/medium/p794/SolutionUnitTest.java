package com.devstromo.medium.p794;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testFindTargetSumWays() {
        assertEquals(5, solution.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
        assertEquals(1, solution.findTargetSumWays(new int[]{1}, 1));
    }

}