package com.devstromo.easy.p463

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Island Perimeter`() {
        assertEquals(
            16, solution.islandPerimeter(
                arrayOf(
                    intArrayOf(0, 1, 0, 0),
                    intArrayOf(1, 1, 1, 0),
                    intArrayOf(0, 1, 0, 0),
                    intArrayOf(1, 1, 0, 0)
                )
            )
        )
        assertEquals(
            4, solution.islandPerimeter(
                arrayOf(
                    intArrayOf(1)
                )
            )
        )
        assertEquals(
            4, solution.islandPerimeter(
                arrayOf(
                    intArrayOf(1, 0)
                )
            )
        )
    }
}