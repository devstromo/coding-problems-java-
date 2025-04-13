package com.devstromo.medium.p1727

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Largest Submatrix With Rearrangements`() {
        assertEquals(
            4, solution.largestSubmatrix(
                arrayOf(
                    intArrayOf(0, 0, 1),
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 0, 1)
                )
            )
        )
        assertEquals(
            2, solution.largestSubmatrix(
                arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 0, 1)
                )
            )
        )
        assertEquals(
            3, solution.largestSubmatrix(
                arrayOf(
                    intArrayOf(1, 0, 1, 0, 1)
                )
            )
        )
    }
}