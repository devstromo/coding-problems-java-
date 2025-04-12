package com.devstromo.medium.p2101

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Detonate the Maximum Bombs`() {
        assertEquals(
            2, solution.maximumDetonation(
                arrayOf(
                    intArrayOf(2, 1, 3),
                    intArrayOf(6, 1, 4),
                )
            )
        )
        assertEquals(
            1, solution.maximumDetonation(
                arrayOf(
                    intArrayOf(1, 1, 5),
                    intArrayOf(10, 10, 5),
                )
            )
        )
        assertEquals(
            5, solution.maximumDetonation(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(2, 3, 1),
                    intArrayOf(3, 4, 2),
                    intArrayOf(4, 5, 3),
                    intArrayOf(5, 6, 4)
                )
            )
        )

        assertEquals(
            1,
            solution.maximumDetonation(
                arrayOf(
                    intArrayOf(1, 1, 100000),
                    intArrayOf(100000, 100000, 1)
                )
            )
        )
    }
}