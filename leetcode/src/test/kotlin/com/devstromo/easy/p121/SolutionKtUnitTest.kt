package com.devstromo.easy.p121

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun testMaxProfit() {
        assertEquals(5, solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(0, solution.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }
}