package com.devstromo.medium.p198;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testRob() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void testRob2() {
        assertEquals(12, solution.rob(new int[]{2, 7, 9, 3, 1}));
    }

}