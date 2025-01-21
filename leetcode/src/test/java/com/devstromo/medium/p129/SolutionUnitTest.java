package com.devstromo.medium.p129;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Sum Root to Leaf Numbers")
    void testSumRootToLeafNumbers() {
        Solution.TreeNode root = new Solution.TreeNode(4,
                new Solution.TreeNode(9,
                        new Solution.TreeNode(5),
                        new Solution.TreeNode(1)
                ),
                new Solution.TreeNode(0)
        );
        assertEquals(1026, solution.sumNumbers(root));
    }
}