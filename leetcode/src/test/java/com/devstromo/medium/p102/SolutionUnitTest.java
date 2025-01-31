package com.devstromo.medium.p102;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Binary Tree Level Order Traversal")
    void testBinaryTreeLevelOrderTraversal() {
        Solution.TreeNode root = new Solution.TreeNode(3,
                new Solution.TreeNode(9),
                new Solution.TreeNode(20,
                        new Solution.TreeNode(15),
                        new Solution.TreeNode(7)
                )
        );
        assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), solution.levelOrder(root));
    }

}