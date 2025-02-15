package com.devstromo.easy.p3417;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Zigzag Grid Traversal With Skip")
    void testZigzagGridTraversalWithSkip() {
        assertEquals(List.of(1, 4), solution.zigzagTraversal(
                new int[][]{
                        {1, 2},
                        {3, 4}
                }
        ));
        assertEquals(List.of(2, 1, 2), solution.zigzagTraversal(
                new int[][]{
                        {2, 1},
                        {2, 1},
                        {2, 1}
                }
        ));
        assertEquals(List.of(1, 3, 5, 7, 9), solution.zigzagTraversal(
                new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        ));
    }
}