package com.devstromo.medium.p583

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Min Distance`() {
        assertEquals(2, solution.minDistance("sea", "eat"))
        assertEquals(4, solution.minDistance("leetcode", "etco"))
        assertEquals(0, solution.minDistance("a", "a"))
    }
}