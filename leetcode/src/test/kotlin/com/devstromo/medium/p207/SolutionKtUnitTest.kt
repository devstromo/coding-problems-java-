package com.devstromo.medium.p207

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Course Schedule`() {
        assertTrue(
            solution.canFinish(
                2, arrayOf(
                    intArrayOf(1, 0),
                )
            )
        )
        assertFalse(
            solution.canFinish(
                2, arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(0, 1),
                )
            )
        )
    }
}