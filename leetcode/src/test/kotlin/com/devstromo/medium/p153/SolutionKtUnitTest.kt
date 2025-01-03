package com.devstromo.medium.p153

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find Minimum in Rotated Sorted Array`() {
        assertEquals(1, solution.findMin(intArrayOf(3, 4, 5, 1, 2)))
        assertEquals(0, solution.findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2)))
        assertEquals(11, solution.findMin(intArrayOf(11, 13, 15, 17)))
    }
}