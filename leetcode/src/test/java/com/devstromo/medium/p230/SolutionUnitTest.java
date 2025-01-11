package com.devstromo.medium.p230;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Find kth Smallest")
    void testFindKthSmallest() {
        final var root = new Solution.TreeNode(3);
        root.left = new Solution.TreeNode(1, null, new Solution.TreeNode(2));
        root.right = new Solution.TreeNode(4);
        assertEquals(1, solution.kthSmallest(root, 1));
    }

}