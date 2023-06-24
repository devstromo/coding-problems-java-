package com.devstromo.easy.p110;

import static com.devstromo.easy.p110.Solution.isBalanced;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testIsBalanced() {
        var tree = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(17)));
        assertTrue(isBalanced(tree));
        assertTrue(isBalanced(new TreeNode()));

    }

    @Test
    void testIsNotBalanced() {
        var leftTree = new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3));
        var tree = new TreeNode(1, leftTree, new TreeNode(2));
        assertFalse(isBalanced(tree));
        tree = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        assertFalse(isBalanced(tree));
    }
}