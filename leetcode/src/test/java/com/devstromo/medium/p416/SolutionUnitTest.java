package com.devstromo.medium.p416;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testPartitionEqualsSubset() {
        assertTrue(solution.canPartition(new int[]{1, 5, 11, 5}));
        assertFalse(solution.canPartition(new int[]{1, 2, 3, 5}));
        assertFalse(solution.canPartition(new int[]{10}));
    }

}