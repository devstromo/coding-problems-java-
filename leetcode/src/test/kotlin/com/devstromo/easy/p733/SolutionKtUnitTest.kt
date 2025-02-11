package com.devstromo.easy.p733

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Flood Fill`() {
        assertTrue(
            arrayOf(
                intArrayOf(2, 2, 2),
                intArrayOf(2, 2, 0),
                intArrayOf(2, 0, 1)
            ).contentDeepEquals(
                solution.floodFill(
                    arrayOf(
                        intArrayOf(1, 1, 1),
                        intArrayOf(1, 1, 0),
                        intArrayOf(1, 0, 1)
                    ), 1, 1, 2
                )
            )
        )

        assertTrue(
            arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 0),
            ).contentDeepEquals(
                solution.floodFill(
                    arrayOf(
                        intArrayOf(0, 0, 0),
                        intArrayOf(0, 0, 0)
                    ), 0, 0, 0
                )
            )
        )
    }
}