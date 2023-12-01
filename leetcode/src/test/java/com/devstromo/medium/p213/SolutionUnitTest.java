package com.devstromo.medium.p213;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testRobberHouseII() {
        assertEquals(3, solution.rob(new int[]{2, 3, 2}));
    }

    @Test
    void testRobberHouseII2() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void testRobberHouseII3() {
        assertEquals(3, solution.rob(new int[]{1, 2, 3}));
    }

    @Test
    void testBestRobberHouseII() {
        assertEquals(3, solution.robBest(new int[]{2, 3, 2}));
    }

    @Test
    void testBestRobberHouseII2() {
        assertEquals(4, solution.robBest(new int[]{1, 2, 3, 1}));
    }

    @Test
    void testBestRobberHouseII3() {
        assertEquals(3, solution.robBest(new int[]{1, 2, 3}));
    }

}