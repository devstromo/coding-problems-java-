package com.devstromo.medium.p2207;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void testMaximumSubsequenceCount() {
        assertEquals(4, solution.maximumSubsequenceCount("abdcdbc", "ac"));
        assertEquals(6, solution.maximumSubsequenceCount("aabb", "ab"));
    }
}