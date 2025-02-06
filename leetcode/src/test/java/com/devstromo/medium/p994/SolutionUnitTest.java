package com.devstromo.medium.p994;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Rotting Oranges")
    void testRottingOranges() {
        assertEquals(4, solution.orangesRotting(new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        }));
        assertEquals(-1, solution.orangesRotting(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        }));
        assertEquals(0, solution.orangesRotting(new int[][]{
                {0, 2}
        }));
    }
}