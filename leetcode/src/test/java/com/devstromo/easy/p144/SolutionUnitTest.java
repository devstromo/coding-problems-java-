package com.devstromo.easy.p144;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, solution.preorderTraversal(root));
    }

    @Test
    public void testExample2() {
        TreeNode root = null;

        List<Integer> expected = List.of();
        assertEquals(expected, solution.preorderTraversal(root));
    }

    @Test
    public void testExample3() {
        TreeNode root = new TreeNode(1);

        List<Integer> expected = List.of(1);
        assertEquals(expected, solution.preorderTraversal(root));
    }

}