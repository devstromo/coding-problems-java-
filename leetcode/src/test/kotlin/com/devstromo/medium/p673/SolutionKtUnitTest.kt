package com.devstromo.medium.p673

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Number of Longest Increasing Subsequences`() {
        assertEquals(2, solution.findNumberOfLIS(intArrayOf(1, 3, 5, 4, 7)))
        assertEquals(5, solution.findNumberOfLIS(intArrayOf(2, 2, 2, 2, 2)))
        assertEquals(1, solution.findNumberOfLIS(intArrayOf(1)))
    }
}