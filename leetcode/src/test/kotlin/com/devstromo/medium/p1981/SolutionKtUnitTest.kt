package com.devstromo.medium.p1981

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Minimize the Difference Between Target and Chosen Elements`() {
        assertEquals(
            0, solution.minimizeTheDifference(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9)
                ), 13
            )
        )
        assertEquals(
            94, solution.minimizeTheDifference(
                arrayOf(
                    intArrayOf(1),
                    intArrayOf(2),
                    intArrayOf(3)
                ), 100
            )
        )
        assertEquals(
            1, solution.minimizeTheDifference(
                arrayOf(
                    intArrayOf(1, 2, 9, 8, 7),
                ), 6
            )
        )
    }
}