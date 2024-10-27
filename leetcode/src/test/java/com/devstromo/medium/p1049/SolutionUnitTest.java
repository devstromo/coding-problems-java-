package com.devstromo.medium.p1049;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testLastStoneWeightII() {
        assertEquals(1, solution.lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1}));
        assertEquals(5, solution.lastStoneWeightII(new int[]{31, 26, 33, 21, 40}));
    }

}