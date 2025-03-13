package com.devstromo.medium.p2316

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Count Unreachable Pairs of Nodes in an Undirected Graph`() {
        assertEquals(
            0, solution.countPairs(
                3, arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 2)
                )
            )
        )
        assertEquals(
            14, solution.countPairs(
                7, arrayOf(
                    intArrayOf(0, 2),
                    intArrayOf(0, 5),
                    intArrayOf(2, 4),
                    intArrayOf(1, 6),
                    intArrayOf(5, 4)
                )
            )
        )
    }
}