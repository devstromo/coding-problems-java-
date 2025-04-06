package com.devstromo.medium.p2658

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Maximum Number of Fish in a Grid`() {
        assertEquals(
            7, solution.findMaxFish(
                arrayOf(
                    intArrayOf(0, 2, 1, 0),
                    intArrayOf(4, 0, 0, 3),
                    intArrayOf(1, 0, 0, 4),
                    intArrayOf(0, 3, 2, 0)
                )
            )
        )

        assertEquals(
            1, solution.findMaxFish(
                arrayOf(
                    intArrayOf(1, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 1)
                )
            )
        )
    }
}