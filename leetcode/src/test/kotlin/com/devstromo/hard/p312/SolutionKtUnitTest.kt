package com.devstromo.hard.p312

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Burst Balloons`() {
        assertEquals(167, solution.maxCoins(intArrayOf(3, 1, 5, 8)))
        assertEquals(10, solution.maxCoins(intArrayOf(1, 5)))
    }

    @Test
    fun `Test Burst Balloons Best`() {
        assertEquals(167, solution.maxCoinsBest(intArrayOf(3, 1, 5, 8)))
        assertEquals(10, solution.maxCoinsBest(intArrayOf(1, 5)))
    }
}