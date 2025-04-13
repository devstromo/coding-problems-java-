package com.devstromo.hard.p1000

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Minimum Cost to Merge Stones`() {
        assertEquals(20, solution.mergeStones(intArrayOf(3, 2, 4, 1), 2))
        assertEquals(-1, solution.mergeStones(intArrayOf(3, 2, 4, 1), 3))
        assertEquals(25, solution.mergeStones(intArrayOf(3, 5, 1, 2, 6), 3))
    }
}