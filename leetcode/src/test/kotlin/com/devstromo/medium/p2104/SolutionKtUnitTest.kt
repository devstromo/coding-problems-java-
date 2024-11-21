package com.devstromo.medium.p2104

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Sub Array Ranges`() {
        assertEquals(4, solution.subArrayRanges(intArrayOf(1, 2, 3)))
        assertEquals(4, solution.subArrayRanges(intArrayOf(1, 3, 3)))
        assertEquals(59, solution.subArrayRanges(intArrayOf(4, -2, -3, 4, 1)))
    }
}