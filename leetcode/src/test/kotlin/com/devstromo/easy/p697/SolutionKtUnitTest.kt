package com.devstromo.easy.p697

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find Shortest SubArray`() {
        assertEquals(2, solution.findShortestSubArray(intArrayOf(1, 2, 2, 3, 1)))
        assertEquals(6, solution.findShortestSubArray(intArrayOf(1, 2, 2, 3, 1, 4, 2)))
        assertEquals(1, solution.findShortestSubArray(intArrayOf(1)))
    }
}