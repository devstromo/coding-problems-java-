package com.devstromo.medium.p300

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Length Of LIS`() {
        assertEquals(4, solution.lengthOfLIS(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)))
        assertEquals(4, solution.lengthOfLIS(intArrayOf(0, 1, 0, 3, 2, 3)))
        assertEquals(1, solution.lengthOfLIS(intArrayOf(7, 7, 7, 7, 7, 7, 7)))
    }

    @Test
    fun `Test Length Of LIS Best Solution`() {
        assertEquals(4, solution.lengthOfLISBestSolution(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)))
        assertEquals(4, solution.lengthOfLISBestSolution(intArrayOf(0, 1, 0, 3, 2, 3)))
        assertEquals(1, solution.lengthOfLISBestSolution(intArrayOf(7, 7, 7, 7, 7, 7, 7)))
    }
}