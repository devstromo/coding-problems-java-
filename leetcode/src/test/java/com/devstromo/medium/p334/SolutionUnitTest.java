package com.devstromo.medium.p334;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Increasing Triplet")
    void testIncreasingTriplet() {
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        assertTrue(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

}