package com.devstromo.hard.p329

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Longest Increasing Path in a Matrix`() {
        Assertions.assertEquals(
            4, solution.longestIncreasingPath(
                arrayOf(
                    intArrayOf(3, 4, 5),
                    intArrayOf(3, 2, 6),
                    intArrayOf(2, 2, 1)
                )
            )
        )
        Assertions.assertEquals(
            1, solution.longestIncreasingPath(
                arrayOf(
                    intArrayOf(1)
                )
            )
        )
    }
}