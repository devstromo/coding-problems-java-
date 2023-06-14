package com.devstromo.easy.p530;

import static com.devstromo.easy.p530.Solution.getMinimumDifference;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    Solution solution = new Solution();

    @Test
    void testGetMinimumDifference() {
        assertEquals(1, getMinimumDifference(new TreeNode(1, new TreeNode(0), new TreeNode(48, new TreeNode(12), new TreeNode(49)))));
    }

    @Test
    void testGetMinimumDifference1() {
        assertEquals(9, getMinimumDifference(new TreeNode(236, new TreeNode(104), new TreeNode(701, new TreeNode(227), new TreeNode(911)))));
    }

    @Test
    void testGetMinimumDifferenceBesRuntime() {

        assertEquals(1, solution.getMinimumDifferenceBestRuntime(new TreeNode(1, new TreeNode(0), new TreeNode(48, new TreeNode(12), new TreeNode(49)))));
    }
}