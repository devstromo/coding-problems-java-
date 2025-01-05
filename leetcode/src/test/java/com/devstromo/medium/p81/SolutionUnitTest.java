package com.devstromo.medium.p81;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Search in Rotated Sorted Array II")
    void testSearchInSortedArray() {
        assertTrue(solution.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        assertFalse(solution.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
        assertTrue(solution.search(new int[]{1}, 1));
        assertTrue(solution.search(new int[]{1, 2}, 2));
    }

}