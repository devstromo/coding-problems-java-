package com.devstromo.medium.p264;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Ugly Number II")
    void testUglyNumber() {
        assertEquals(12, solution.nthUglyNumber(10));
        assertEquals(1, solution.nthUglyNumber(1));
    }

}