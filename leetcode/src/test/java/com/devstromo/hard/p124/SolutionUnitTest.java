package com.devstromo.hard.p124;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Binary Tree Maximum Path Sum")
    void testBinaryTreeMaximumPathSum() {
        var root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(3);
        assertEquals(6, solution.maxPathSum(root));
    }
}