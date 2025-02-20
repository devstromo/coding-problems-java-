package com.devstromo.medium.p310

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Minimum Height Trees`() {
        assertEquals(
            listOf(1), solution.findMinHeightTrees(
                4, arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(1, 2),
                    intArrayOf(1, 3)
                )
            )
        )
        assertEquals(
            listOf(3, 4), solution.findMinHeightTrees(
                6, arrayOf(
                    intArrayOf(3, 0),
                    intArrayOf(3, 1),
                    intArrayOf(3, 2),
                    intArrayOf(3, 4),
                    intArrayOf(4, 5),
                )
            )
        )
    }

    @Test
    fun `Test Minimum Height Trees Best`() {
        assertEquals(
            listOf(1), solution.findMinHeightTreesBest(
                4, arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(1, 2),
                    intArrayOf(1, 3)
                )
            )
        )
        assertEquals(
            listOf(3, 4), solution.findMinHeightTreesBest(
                6, arrayOf(
                    intArrayOf(3, 0),
                    intArrayOf(3, 1),
                    intArrayOf(3, 2),
                    intArrayOf(3, 4),
                    intArrayOf(4, 5),
                )
            )
        )
    }
}