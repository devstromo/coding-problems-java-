package com.devstromo.medium.p153;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Find Minimum in Rotated Sorted Array")
    void testFindMinimumInRotatedSortedArray() {
        assertEquals(1, solution.findMin(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        assertEquals(11, solution.findMin(new int[]{11, 13, 15, 17}));
    }

}