package com.devstromo.medium.p241

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Different Ways to Add Parentheses`() {
        val expected = listOf(0, 2)
        val result = solution.diffWaysToCompute("2-1-1")
        assertTrue(expected.containsAll(result) && result.containsAll(expected))
        val expected1 = listOf(-34, -14, -10, -10, 10)
        val result1 = solution.diffWaysToCompute("2*3-4*5")
        assertTrue(expected1.containsAll(result1) && result1.containsAll(expected1))
    }
}