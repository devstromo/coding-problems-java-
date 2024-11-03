package com.devstromo.medium.p279

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test numbers squares`() {
        assertEquals(3, solution.numSquares(12))
        assertEquals(2, solution.numSquares(13))
    }
}