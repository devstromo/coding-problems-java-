package com.devstromo.medium.p1905

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Count Sub Islands`() {
        assertEquals(
            3, solution.countSubIslands(
                arrayOf(
                    intArrayOf(1, 1, 1, 0, 0),
                    intArrayOf(0, 1, 1, 1, 1),
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(1, 0, 0, 0, 0),
                    intArrayOf(1, 1, 0, 1, 1)
                ),
                arrayOf(
                    intArrayOf(1, 1, 1, 0, 0),
                    intArrayOf(0, 0, 1, 1, 1),
                    intArrayOf(0, 1, 0, 0, 0),
                    intArrayOf(1, 0, 1, 1, 0),
                    intArrayOf(0, 1, 0, 1, 0)
                )
            )
        )
        assertEquals(
            2, solution.countSubIslands(
                arrayOf(
                    intArrayOf(1, 0, 1, 0, 1),
                    intArrayOf(1, 1, 1, 1, 1),
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(1, 1, 1, 1, 1),
                    intArrayOf(1, 0, 1, 0, 1)
                ),
                arrayOf(
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(1, 1, 1, 1, 1),
                    intArrayOf(0, 1, 0, 1, 0),
                    intArrayOf(0, 1, 0, 1, 0),
                    intArrayOf(1, 0, 0, 0, 1)
                )
            )
        )
    }

    @Test
    fun `Test Count Sub Islands Best`() {
        assertEquals(
            3, solution.countSubIslandsBest(
                arrayOf(
                    intArrayOf(1, 1, 1, 0, 0),
                    intArrayOf(0, 1, 1, 1, 1),
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(1, 0, 0, 0, 0),
                    intArrayOf(1, 1, 0, 1, 1)
                ),
                arrayOf(
                    intArrayOf(1, 1, 1, 0, 0),
                    intArrayOf(0, 0, 1, 1, 1),
                    intArrayOf(0, 1, 0, 0, 0),
                    intArrayOf(1, 0, 1, 1, 0),
                    intArrayOf(0, 1, 0, 1, 0)
                )
            )
        )
        assertEquals(
            2, solution.countSubIslandsBest(
                arrayOf(
                    intArrayOf(1, 0, 1, 0, 1),
                    intArrayOf(1, 1, 1, 1, 1),
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(1, 1, 1, 1, 1),
                    intArrayOf(1, 0, 1, 0, 1)
                ),
                arrayOf(
                    intArrayOf(0, 0, 0, 0, 0),
                    intArrayOf(1, 1, 1, 1, 1),
                    intArrayOf(0, 1, 0, 1, 0),
                    intArrayOf(0, 1, 0, 1, 0),
                    intArrayOf(1, 0, 0, 0, 1)
                )
            )
        )
    }
}