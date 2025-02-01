package com.devstromo.medium.p698;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Partition to K Equal Sum Subsets")
    void testPartitionToKEqualSumSubsets() {
        assertTrue(solution.canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4));
        assertFalse(solution.canPartitionKSubsets(new int[]{1, 2, 3, 4}, 3));
    }

}