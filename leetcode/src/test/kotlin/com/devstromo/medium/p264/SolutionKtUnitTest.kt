package com.devstromo.medium.p264

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Ugly Number II`() {
        assertEquals(12, solution.nthUglyNumber(10))
        assertEquals(1, solution.nthUglyNumber(1))
    }
}