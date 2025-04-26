package com.devstromo.hard.p329;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Longest Increasing Path in a Matrix")
    void testLongestIncreasingPath() {
        assertEquals(4, solution.longestIncreasingPath(new int[][]{
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}
        }));
        assertEquals(1, solution.longestIncreasingPath(new int[][]{
                {1}
        }));
    }

}