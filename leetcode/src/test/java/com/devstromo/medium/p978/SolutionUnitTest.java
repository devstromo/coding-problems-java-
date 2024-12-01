package com.devstromo.medium.p978;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testMaxTurbulence() {
        assertEquals(5, solution.maxTurbulenceSize(new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9}));
        assertEquals(2, solution.maxTurbulenceSize(new int[]{4, 8, 12, 16}));
        assertEquals(1, solution.maxTurbulenceSize(new int[]{100}));
    }

}