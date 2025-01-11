package com.devstromo.easy.p257;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Binary Tree Paths")
    void testBinaryTreePaths() {
        final var root1 = new Solution.TreeNode(1);
        root1.left = new Solution.TreeNode(2, null, new Solution.TreeNode(5));
        root1.right = new Solution.TreeNode(3);
        assertEquals(List.of("1->2->5", "1->3"), solution.binaryTreePaths(root1));
    }

    @Test
    @DisplayName("Test Binary Tree Paths Best")
    void testBinaryTreePathsBest() {
        final var root1 = new Solution.TreeNode(1);
        root1.left = new Solution.TreeNode(2, null, new Solution.TreeNode(5));
        root1.right = new Solution.TreeNode(3);
        assertEquals(List.of("1->2->5", "1->3"), solution.binaryTreePathsBest(root1));
    }

}