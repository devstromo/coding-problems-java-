package com.devstromo.medium.p122

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()
    @Test
    fun `Test Max Profit II`() {
        assertEquals(7, solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(4, solution.maxProfit(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0, solution.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }

}