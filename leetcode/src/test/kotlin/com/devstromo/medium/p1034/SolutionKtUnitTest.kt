package com.devstromo.medium.p1034

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Coloring A Border`() {
        assertArrayEquals(
            arrayOf(
                intArrayOf(3, 3),
                intArrayOf(3, 2)
            ),
            solution.colorBorder(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 2)
                ), 0, 0, 3
            )
        )
        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 3, 3),
                intArrayOf(2, 3, 3)
            ),
            solution.colorBorder(
                arrayOf(
                    intArrayOf(1, 2, 2),
                    intArrayOf(2, 3, 2)
                ), 0, 1, 3
            )
        )
        assertArrayEquals(
            arrayOf(
                intArrayOf(2, 2, 2),
                intArrayOf(2, 1, 2),
                intArrayOf(2, 2, 2)
            ),
            solution.colorBorder(
                arrayOf(
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 1, 1)
                ), 1, 1, 2
            )
        )
    }

}