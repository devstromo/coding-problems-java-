package com.devstromo.medium.p1749

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Max Absolute Sum`() {
        assertEquals(5, solution.maxAbsoluteSum(intArrayOf(1, -3, 2, 3, -4)))
        assertEquals(8, solution.maxAbsoluteSum(intArrayOf(2, -5, 1, -4, 3, -2)))
    }
}