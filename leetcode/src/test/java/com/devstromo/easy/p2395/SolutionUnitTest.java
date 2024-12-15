package com.devstromo.easy.p2395;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testFindSubarrays() {
        assertTrue(solution.findSubarrays(new int[]{4, 2, 4}));
        assertFalse(solution.findSubarrays(new int[]{1, 2, 3, 4, 5}));
        assertTrue(solution.findSubarrays(new int[]{0,0,0}));
    }

}