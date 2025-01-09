package com.devstromo.hard.p354

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Max Envelopes`() {
        assertEquals(
            3, solution.maxEnvelopes(
                arrayOf(
                    intArrayOf(5, 4),
                    intArrayOf(6, 4),
                    intArrayOf(6, 7),
                    intArrayOf(2, 3)
                )
            )
        )

        assertEquals(
            1, solution.maxEnvelopes(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                    intArrayOf(1, 1)
                )
            )
        )
    }
}