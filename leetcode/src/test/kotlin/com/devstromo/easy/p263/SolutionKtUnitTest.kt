package com.devstromo.easy.p263

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test is ugly`() {
        assertTrue(solution.isUgly(5))
        assertTrue(solution.isUgly(6))
        assertFalse(solution.isUgly(14))
    }

    @Test
    fun `Test is ugly best`() {
        assertTrue(solution.isUglyBest(5))
        assertTrue(solution.isUglyBest(6))
        assertFalse(solution.isUglyBest(14))
    }

}