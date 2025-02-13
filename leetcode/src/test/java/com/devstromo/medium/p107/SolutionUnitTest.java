package com.devstromo.medium.p107;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Binary Tree Level Order Traversal II")
    void testBinaryTreeLevelOrderTraversal() {
        var root = new Solution.TreeNode(3,
                new Solution.TreeNode(9),
                new Solution.TreeNode(20,
                        new Solution.TreeNode(15),
                        new Solution.TreeNode(7)
                )
        );

        assertEquals(List.of(List.of(15, 7), List.of(9, 20), List.of(3)), solution.levelOrderBottom(root));
        var singleRoot = new Solution.TreeNode(1);
        assertEquals(List.of(List.of(1)), solution.levelOrderBottom(singleRoot));
        assertEquals(List.of(), solution.levelOrderBottom(null));

    }

    @Test
    @DisplayName("Test Binary Tree Level Order Traversal II Best")
    void testBinaryTreeLevelOrderTraversalBest() {
        var root = new Solution.TreeNode(3,
                new Solution.TreeNode(9),
                new Solution.TreeNode(20,
                        new Solution.TreeNode(15),
                        new Solution.TreeNode(7)
                )
        );

        assertEquals(List.of(List.of(15, 7), List.of(9, 20), List.of(3)), solution.levelOrderBottomBest(root));
        var singleRoot = new Solution.TreeNode(1);
        assertEquals(List.of(List.of(1)), solution.levelOrderBottomBest(singleRoot));
        assertEquals(List.of(), solution.levelOrderBottomBest(null));

    }
}