package com.devstromo.medium.p2770

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test can jum`() {
        val nums = intArrayOf(1, 3, 6, 4, 1, 2)
        assertEquals(3, solution.maximumJumps(nums, 2))
        assertEquals(5, solution.maximumJumps(nums, 3))
        assertEquals(-1, solution.maximumJumps(nums, 0))
        assertEquals(-1, solution.maximumJumps(intArrayOf(0, 2, 1, 3), 1))
    }

}