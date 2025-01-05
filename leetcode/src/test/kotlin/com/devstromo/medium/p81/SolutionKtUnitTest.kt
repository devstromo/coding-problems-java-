package com.devstromo.medium.p81

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Search in Rotated Sorted Array II`() {
        assertTrue(solution.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0))
        assertFalse(solution.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 3))
        assertTrue(solution.search(intArrayOf(1), 1))
        assertTrue(solution.search(intArrayOf(1, 2), 2))
    }
}