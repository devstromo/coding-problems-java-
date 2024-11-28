package com.devstromo.easy.p724

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Pivot Index`() {
        assertEquals(3, solution.pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)))
        assertEquals(-1, solution.pivotIndex(intArrayOf(1, 2, 3)))
        assertEquals(0, solution.pivotIndex(intArrayOf(2, 1, -1)))
    }
}