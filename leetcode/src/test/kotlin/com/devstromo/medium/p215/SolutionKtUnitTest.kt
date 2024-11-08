package com.devstromo.medium.p215

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find Kth Largest`() {
        assertEquals(5, solution.findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2))
        assertEquals(4, solution.findKthLargest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4))
    }

    @Test
    fun `Test Find Kth Largest Best`() {
        assertEquals(5, solution.findKthLargestBest(intArrayOf(3, 2, 1, 5, 6, 4), 2))
        assertEquals(4, solution.findKthLargestBest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4))
    }
}