package com.devstromo.hard.p1573

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Minimum Cost to Cut a Stick`() {
        assertEquals(16, solutionKt.minCost(7, intArrayOf(1, 3, 4, 5)))
        assertEquals(22, solutionKt.minCost(9, intArrayOf(5, 6, 1, 4, 2)))
    }
}