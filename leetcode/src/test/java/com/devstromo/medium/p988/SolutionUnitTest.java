package com.devstromo.medium.p988;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Smallest String Starting From Leaf")
    void testSmallestFromLeaf() {
        Solution.TreeNode root = new Solution.TreeNode(0,
                new Solution.TreeNode(1,
                        new Solution.TreeNode(3),
                        new Solution.TreeNode(4)
                ),
                new Solution.TreeNode(2,
                        new Solution.TreeNode(3),
                        new Solution.TreeNode(4)
                )
        );
        assertEquals("dba", solution.smallestFromLeaf(root));

        root = new Solution.TreeNode(25,
                new Solution.TreeNode(1,
                        new Solution.TreeNode(1),
                        new Solution.TreeNode(3)
                ),
                new Solution.TreeNode(3,
                        new Solution.TreeNode(0),
                        new Solution.TreeNode(2)
                )
        );
        assertEquals("adz", solution.smallestFromLeaf(root));

        root = new Solution.TreeNode(2,
                new Solution.TreeNode(2,
                        null,
                        new Solution.TreeNode(1,
                                new Solution.TreeNode(0),
                                null
                        )
                ),
                new Solution.TreeNode(1,
                        new Solution.TreeNode(0),
                        null
                )
        );
        assertEquals("abc", solution.smallestFromLeaf(root));
    }
}