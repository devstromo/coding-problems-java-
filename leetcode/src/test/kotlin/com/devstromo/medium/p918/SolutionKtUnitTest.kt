package com.devstromo.medium.p918

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Max Subarray Sum Circular`() {
        assertEquals(3, solutionKt.maxSubarraySumCircular(intArrayOf(1, -2, 3, -2)))
        assertEquals(10, solutionKt.maxSubarraySumCircular(intArrayOf(5, -3, 5)))
        assertEquals(-2, solutionKt.maxSubarraySumCircular(intArrayOf(-3, -2, -3)))
    }

}