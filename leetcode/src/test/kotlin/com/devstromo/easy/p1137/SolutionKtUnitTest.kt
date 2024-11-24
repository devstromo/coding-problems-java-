package com.devstromo.easy.p1137

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()
    @Test
    fun `Test Tribonacci `() {
        assertEquals(1, solution.tribonacci(2))
        assertEquals(4, solution.tribonacci(4))
        assertEquals(1389537, solution.tribonacci(25))
    }
}