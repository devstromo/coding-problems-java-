package com.devstromo.easy.p724;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testPivotIndex() {
        assertEquals(3, solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        assertEquals(-1, solution.pivotIndex(new int[]{1, 2, 3}));
        assertEquals(0, solution.pivotIndex(new int[]{2, 1, -1}));
    }

    @Test
    void testPivotIndexNoAdditionalSpace() {
        assertEquals(3, solution.pivotIndexNoAdditionalSpace(new int[]{1, 7, 3, 6, 5, 6}));
        assertEquals(-1, solution.pivotIndexNoAdditionalSpace(new int[]{1, 2, 3}));
        assertEquals(0, solution.pivotIndexNoAdditionalSpace(new int[]{2, 1, -1}));
    }

}