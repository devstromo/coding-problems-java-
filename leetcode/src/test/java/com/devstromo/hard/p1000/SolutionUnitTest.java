package com.devstromo.hard.p1000;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Minimum Cost to Merge Stones")
    void testMinimumCostToMergeStones() {
        assertEquals(20, solution.mergeStones(new int[]{3, 2, 4, 1}, 2));
        assertEquals(-1, solution.mergeStones(new int[]{3, 2, 4, 1}, 3));
        assertEquals(25, solution.mergeStones(new int[]{3, 5, 1, 2, 6}, 3));
    }

    @Test
    @DisplayName("Test Minimum Cost to Merge Stones Best")
    void testMinimumCostToMergeStonesBest() {
        assertEquals(20, solution.mergeStonesBest(new int[]{3, 2, 4, 1}, 2));
        assertEquals(-1, solution.mergeStonesBest(new int[]{3, 2, 4, 1}, 3));
        assertEquals(25, solution.mergeStonesBest(new int[]{3, 5, 1, 2, 6}, 3));
    }
}