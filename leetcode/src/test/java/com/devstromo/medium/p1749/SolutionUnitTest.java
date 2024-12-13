package com.devstromo.medium.p1749;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testMaxAbsoluteSum() {
        assertEquals(5, solution.maxAbsoluteSum(new int[]{1, -3, 2, 3, -4}));
        assertEquals(8, solution.maxAbsoluteSum(new int[]{2, -5, 1, -4, 3, -2}));
    }

}