package com.devstromo.hard.p312;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Burst Balloons")
    void testBurstBalloons() {
        assertEquals(167, solution.maxCoins(new int[]{3, 1, 5, 8}));
        assertEquals(10, solution.maxCoins(new int[]{1, 5}));
    }

    @Test
    @DisplayName("Test Burst Balloons Best")
    void testBurstBalloonsBest() {
        assertEquals(167, solution.maxCoinsBest(new int[]{3, 1, 5, 8}));
        assertEquals(10, solution.maxCoinsBest(new int[]{1, 5}));
    }

}