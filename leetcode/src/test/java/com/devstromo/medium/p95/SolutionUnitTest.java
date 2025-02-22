package com.devstromo.medium.p95;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Unique Binary Search Trees II")
    void testUniqueBinarySearchTrees() {
        var result = solution.generateTrees(1);
        assertEquals(1, result.size()); // Only one BST possible
        assertEquals(1, result.getFirst().val);

        var resultOne = solution.generateTrees(3);
        assertEquals(5, resultOne.size());

        var resultSecond = solution.generateTrees(0);
        assertTrue(resultSecond.isEmpty());
    }
}