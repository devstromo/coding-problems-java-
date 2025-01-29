package com.devstromo.medium.p687;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Longest Univalue Path")
    void testLongestUnivaluePath() {
        Solution.TreeNode root = new Solution.TreeNode(
                5,
                new Solution.TreeNode(4,
                        new Solution.TreeNode(1),
                        new Solution.TreeNode(1)
                ),
                new Solution.TreeNode(5,
                        null,
                        new Solution.TreeNode(5)
                )
        );
        assertEquals(2, solution.longestUnivaluePath(root));
    }


}