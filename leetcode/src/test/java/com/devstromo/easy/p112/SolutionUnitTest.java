package com.devstromo.easy.p112;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Path Sum in Binary Tree")
    void pathSumBinaryTree() {
        Solution.TreeNode root = new Solution.TreeNode(5,
                new Solution.TreeNode(4,
                        new Solution.TreeNode(11,
                                new Solution.TreeNode(7),
                                new Solution.TreeNode(2)
                        ),
                        null
                ),
                new Solution.TreeNode(8,
                        new Solution.TreeNode(13),
                        new Solution.TreeNode(4,
                                null,
                                new Solution.TreeNode(1)
                        )
                )
        );
        assertTrue(solution.hasPathSum(root, 22));
        assertFalse(solution.hasPathSum(null, 0));
    }

}