package com.devstromo.medium.p2104;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testSubArrayRanges() {
        assertEquals(4, solution.subArrayRanges(new int[]{1, 2, 3}));
        assertEquals(4, solution.subArrayRanges(new int[]{1, 3, 3}));
        assertEquals(59, solution.subArrayRanges(new int[]{4, -2, -3, 4, 1}));
    }

}