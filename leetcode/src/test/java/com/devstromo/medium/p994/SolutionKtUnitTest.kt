package com.devstromo.medium.p994

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Rotting Oranges`() {
        assertEquals(
            4, solution.orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 1, 1)
                )
            )
        )
        assertEquals(
            -1, solution.orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(0, 1, 1),
                    intArrayOf(1, 0, 1)
                )
            )
        )
        assertEquals(
            0, solution.orangesRotting(
                arrayOf(
                    intArrayOf(0, 2)
                )
            )
        )
    }
}