package com.devstromo.medium.p1727;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();


    @Test
    @DisplayName("Test Largest Submatrix With Rearrangements")
    void testLargestSubmatrixWithRearrangements() {
        assertEquals(4, solution.largestSubmatrix(new int[][]{
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 1}
        }));
        assertEquals(2, solution.largestSubmatrix(new int[][]{
                {1, 1, 0},
                {1, 0, 1}
        }));
        assertEquals(3, solution.largestSubmatrix(new int[][]{
                {1, 0, 1, 0, 1}
        }));
    }
}