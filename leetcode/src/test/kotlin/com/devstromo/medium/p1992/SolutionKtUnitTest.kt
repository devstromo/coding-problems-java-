package com.devstromo.medium.p1992

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Find All Groups of Farmland`() {
        assertArrayEquals(
            arrayOf<IntArray?>(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(1, 1, 2, 2),
            ),
            solution.findFarmland(
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(0, 1, 1),
                    intArrayOf(0, 1, 1)
                )
            )
        )
        assertArrayEquals(
            arrayOf<IntArray?>(
                intArrayOf(0, 0, 1, 1)
            ),
            solution.findFarmland(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1)
                )
            )
        )
        assertArrayEquals(
            arrayOf<IntArray?>(
                intArrayOf(0)
            ),
            solution.findFarmland(arrayOf())
        )
    }

}