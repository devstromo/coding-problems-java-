package com.devstromo.medium.p113;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Path Sum II in Binary Tree")
    void testPathSumII() {
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
                                new Solution.TreeNode(5),
                                new Solution.TreeNode(1)
                        )
                )
        );

        Solution.TreeNode root2 = new Solution.TreeNode(1,
                new Solution.TreeNode(2
                ),
                new Solution.TreeNode(3
                )
        );

        assertEquals(List.of(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5)), solution.pathSum(root, 22));
        assertEquals(List.of(), solution.pathSum(root2, 5));
    }

    @Test
    @DisplayName("Test Path Sum II in Binary Tree Best")
    void testPathSumIIBest() {
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
                                new Solution.TreeNode(5),
                                new Solution.TreeNode(1)
                        )
                )
        );

        Solution.TreeNode root2 = new Solution.TreeNode(1,
                new Solution.TreeNode(2
                ),
                new Solution.TreeNode(3
                )
        );

        assertEquals(List.of(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5)), solution.pathSumBest(root, 22));
        assertEquals(List.of(), solution.pathSumBest(root2, 5));
    }

}