package com.devstromo.medium.p698

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Partition to K Equal Sum Subsets`() {
        assertTrue(solution.canPartitionKSubsets(intArrayOf(4, 3, 2, 3, 5, 2, 1), 4))
        assertFalse(solution.canPartitionKSubsets(intArrayOf(1, 2, 3, 4), 3))
    }

    @Test
    fun `Test Partition to K Equal Sum Subsets Best`() {
        assertTrue(solution.canPartitionKSubsetsBest(intArrayOf(4, 3, 2, 3, 5, 2, 1), 4))
        assertFalse(solution.canPartitionKSubsetsBest(intArrayOf(1, 2, 3, 4), 3))
    }
}