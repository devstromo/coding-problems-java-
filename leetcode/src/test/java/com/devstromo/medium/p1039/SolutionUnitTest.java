package com.devstromo.medium.p1039;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Minimum Score Triangulation of Polygon")
    void testMinimumTriangulation() {
        assertEquals(6, solution.minScoreTriangulation(new int[]{1, 2, 3}));
        assertEquals(144, solution.minScoreTriangulation(new int[]{3, 7, 4, 5}));
        assertEquals(13, solution.minScoreTriangulation(new int[]{1, 3, 1, 4, 1, 5}));
    }

}