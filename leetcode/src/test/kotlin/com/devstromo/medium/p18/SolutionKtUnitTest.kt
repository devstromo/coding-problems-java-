package com.devstromo.medium.p18

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Four Sum`() {
        assertEquals(
            listOf(
                listOf(-2, -1, 1, 2), listOf(-2, 0, 0, 2), listOf(-1, 0, 0, 1)
            ),
            solution.fourSum(
                intArrayOf(1, 0, -1, 0, -2, 2), 0
            )
        )
        assertEquals(listOf(listOf(2, 2, 2, 2)), solution.fourSum(intArrayOf(2, 2, 2, 2, 2), 8))
    }
}