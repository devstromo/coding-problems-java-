package com.devstromo.easy.p2578

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Split Num`() {
        assertEquals(59, solution.splitNum(4325))
        assertEquals(75, solution.splitNum(687))
    }
}