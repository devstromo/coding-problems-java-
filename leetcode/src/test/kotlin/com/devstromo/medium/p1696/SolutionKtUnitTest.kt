package com.devstromo.medium.p1696

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test jump game 6`() {
        assertEquals(7, solution.maxResult(intArrayOf(1, -1, -2, 4, -7, 3), 2))
        assertEquals(17, solution.maxResult(intArrayOf(10, -5, -2, 4, 0, 3), 3))
        assertEquals(0, solution.maxResult(intArrayOf(1, -5, -20, 4, -1, 3, -6, -3), 2))
    }
}