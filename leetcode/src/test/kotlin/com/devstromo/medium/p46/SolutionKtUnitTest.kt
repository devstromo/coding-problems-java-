package com.devstromo.medium.p46

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Permutations`() {
        var expected = listOf(
            listOf(1, 2, 3), listOf(1, 3, 2), listOf(2, 1, 3), listOf(2, 3, 1),
            listOf(3, 1, 2), listOf(3, 2, 1)
        )
        assertEquals(expected, solution.permute(intArrayOf(1, 2, 3)))
        expected = listOf(listOf(0, 1), listOf(1, 0))
        assertEquals(expected, solution.permute(intArrayOf(0, 1)))
    }
}