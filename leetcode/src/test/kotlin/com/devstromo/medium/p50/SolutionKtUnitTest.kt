package com.devstromo.medium.p50

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Pow(x, n)`() {
        val epsilon = 1e-5
        assertEquals(1024.00000, solution.myPow(2.00000, 10), epsilon)
        assertEquals(9.26100, solution.myPow(2.10000, 3), epsilon)
        assertEquals(0.25000, solution.myPow(2.00000, -2), epsilon)
    }

    @Test
    fun `Test Pow(x, n) Best`() {
        val epsilon = 1e-5
        assertEquals(1024.00000, solution.myPowBest(2.00000, 10), epsilon)
        assertEquals(9.26100, solution.myPowBest(2.10000, 3), epsilon)
        assertEquals(0.25000, solution.myPowBest(2.00000, -2), epsilon)
    }

}