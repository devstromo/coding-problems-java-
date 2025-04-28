package com.devstromo.medium.p1947

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    @DisplayName("Test Maximum Compatibility Score Sum")
    fun testMaximumCompatibilityScoreSum() {
        assertEquals(
            8, solution.maxCompatibilitySum(
                arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 0, 1),
                    intArrayOf(0, 0, 1)
                ),
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(0, 0, 1),
                    intArrayOf(1, 1, 0)
                )
            )
        )
        assertEquals(
            0, solution.maxCompatibilitySum(
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(0, 0),
                    intArrayOf(0, 0),
                ),
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                )
            )
        )
    }
}