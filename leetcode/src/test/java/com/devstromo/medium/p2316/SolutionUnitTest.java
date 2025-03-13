package com.devstromo.medium.p2316;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Count Unreachable Pairs of Nodes in an Undirected Graph")
    void testCountUnreachablePairs() {
        assertEquals(0, solution.countPairs(3, new int[][]{
                        {0, 1},
                        {0, 2},
                        {1, 2}
                }
        ));
        assertEquals(14, solution.countPairs(7, new int[][]{
                        {0, 2},
                        {0, 5},
                        {2, 4},
                        {1, 6},
                        {5, 4}
                }
        ));
    }
}