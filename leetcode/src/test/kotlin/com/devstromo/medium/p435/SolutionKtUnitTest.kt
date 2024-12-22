package com.devstromo.medium.p435

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Erase Overlap Intervals`() {
        assertEquals(
            1, solution.eraseOverlapIntervals(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(3, 4),
                    intArrayOf(1, 3)
                )
            )
        )
        assertEquals(
            2, solution.eraseOverlapIntervals(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(1, 2),
                    intArrayOf(1, 2)
                )
            )
        )
        assertEquals(
            0, solution.eraseOverlapIntervals(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3)
                )
            )
        )
    }

}