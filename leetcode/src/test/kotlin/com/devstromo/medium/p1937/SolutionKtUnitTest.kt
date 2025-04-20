package com.devstromo.medium.p1937

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Maximum Number of Points with Cost`() {
        Assertions.assertEquals(
            9, solution.maxPoints(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(1, 5, 1),
                    intArrayOf(3, 1, 1)
                )
            )
        )
        Assertions.assertEquals(
            11, solution.maxPoints(
                arrayOf(
                    intArrayOf(1, 5),
                    intArrayOf(2, 3),
                    intArrayOf(4, 2)
                )
            )
        )
    }

}