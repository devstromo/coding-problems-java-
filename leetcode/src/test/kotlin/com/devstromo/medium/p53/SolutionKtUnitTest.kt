package com.devstromo.medium.p53

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test max sub array sum`() {
        assertEquals(6, solution.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)));
        assertEquals(1, solution.maxSubArray(intArrayOf(1)));
        assertEquals(23, solution.maxSubArray(intArrayOf(5, 4, -1, 7, 8)));
    }
}