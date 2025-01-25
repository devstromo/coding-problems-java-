package com.devstromo.medium.p210

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Course Schedule II`() {
        val actual = solution.findOrder(
            4, arrayOf(
                intArrayOf(1, 0),
                intArrayOf(2, 0),
                intArrayOf(3, 1),
                intArrayOf(3, 2),
            )
        )
        val expectedOutputs = listOf(
            intArrayOf(0, 1, 2, 3),
            intArrayOf(0, 2, 1, 3)
        )

        assertTrue(
            expectedOutputs.stream().anyMatch { expected: IntArray -> expected.contentEquals(actual) }
        )
    }
}