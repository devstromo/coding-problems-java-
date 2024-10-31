package com.devstromo.hard.p84

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()


    @Test
    fun `Test Largest Rectangle Area`() {
        assertEquals(10, solution.largestRectangleArea(intArrayOf(2, 1, 5, 6, 2, 3)))
        assertEquals(4, solution.largestRectangleArea(intArrayOf(2, 4)))
    }
}