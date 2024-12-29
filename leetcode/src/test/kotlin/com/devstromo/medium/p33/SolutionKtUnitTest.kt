package com.devstromo.medium.p33

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Search in Rotated Sorted Array`() {
        assertEquals(4, solution.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
        assertEquals(-1, solution.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
        assertEquals(-1, solution.search(intArrayOf(1), 0))
    }
}