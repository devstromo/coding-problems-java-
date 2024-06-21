package com.devstromo.medium.p506

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Subarray Sum Equals K`() {
        assertEquals(2, solution.subarraySum(intArrayOf(1, 2, 3), 3))
        assertEquals(2, solution.subarraySum(intArrayOf(1, 1, 1), 2))
        val largeNums = intArrayOf(1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4)
        assertEquals(0, solution.subarraySum(largeNums, 100))
    }

    @Test
    fun `Test Subarray Sum Equals K Best Solution`() {
        assertEquals(2, solution.subarraySumBestSolution(intArrayOf(1, 2, 3), 3))
        assertEquals(2, solution.subarraySumBestSolution(intArrayOf(1, 1, 1), 2))
        val largeNums = intArrayOf(1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4);
        assertEquals(0, solution.subarraySumBestSolution(largeNums, 100))
    }
}