package com.devstromo.easy.p3417

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Zigzag Grid Traversal With Skip`() {
        assertEquals(
            listOf(1, 4), solution.zigzagTraversal(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(3, 4)
                )
            )
        )
        assertEquals(
            listOf(2, 1, 2), solution.zigzagTraversal(
                arrayOf(
                    intArrayOf(2, 1),
                    intArrayOf(2, 1),
                    intArrayOf(2, 1)
                )
            )
        )
        assertEquals(
            listOf(1, 3, 5, 7, 9), solution.zigzagTraversal(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9)
                )
            )
        )
    }
}