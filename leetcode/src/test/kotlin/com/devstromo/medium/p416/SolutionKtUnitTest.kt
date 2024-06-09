package com.devstromo.medium.p416

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Partition Equal Subset Sum`() {
        assertTrue(solutionKt.canPartition(intArrayOf(1, 5, 11, 5)))
        assertFalse(solutionKt.canPartition(intArrayOf(1, 2, 3, 5)))
        assertFalse(solutionKt.canPartition(intArrayOf(10)))
    }
}