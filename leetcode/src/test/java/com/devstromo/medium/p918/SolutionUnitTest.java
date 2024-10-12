package com.devstromo.medium.p918;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testMaxSubarraySumCircular() {
        assertEquals(3, solution.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
        assertEquals(10, solution.maxSubarraySumCircular(new int[]{5, -3, 5}));
        assertEquals(-2, solution.maxSubarraySumCircular(new int[]{-3, -2, -3}));
    }

}