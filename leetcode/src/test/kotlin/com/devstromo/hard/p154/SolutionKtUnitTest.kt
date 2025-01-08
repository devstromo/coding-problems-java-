package com.devstromo.hard.p154

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find Minimum`() {
        assertEquals(1, solution.findMin(intArrayOf(1, 3, 5)))
        assertEquals(0, solution.findMin(intArrayOf(2, 2, 2, 0, 1)))
    }
}