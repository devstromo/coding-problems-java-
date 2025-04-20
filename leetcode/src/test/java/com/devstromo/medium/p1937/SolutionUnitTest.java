package com.devstromo.medium.p1937;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Maximum Number of Points with Cost")
    void testMaximumNumberOfPointsWithCost() {
        assertEquals(9, solution.maxPoints(new int[][]{
                {1, 2, 3},
                {1, 5, 1},
                {3, 1, 1}
        }));
        assertEquals(11, solution.maxPoints(new int[][]{
                {1, 5},
                {2, 3},
                {4, 2}
        }));
    }

    @Test
    @DisplayName("Test Maximum Number of Points with Cost Best")
    void testMaximumNumberOfPointsWithCostBest() {
        assertEquals(9, solution.maxPointsBest(new int[][]{
                {1, 2, 3},
                {1, 5, 1},
                {3, 1, 1}
        }));
        assertEquals(11, solution.maxPointsBest(new int[][]{
                {1, 5},
                {2, 3},
                {4, 2}
        }));
    }
}