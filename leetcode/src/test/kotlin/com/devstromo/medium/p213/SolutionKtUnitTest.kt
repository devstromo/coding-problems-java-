package com.devstromo.medium.p213


import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    val solutionKt = SolutionKt()

    @Test
    fun `Test Rob II Kt Solution`() {
        assertEquals(3, solutionKt.rob(intArrayOf(2, 3, 2)))
    }

    @Test
    fun `Test Second Rob II Kt Solution`() {
        assertEquals(4, solutionKt.rob(intArrayOf(1, 2, 3, 1)))
    }

    @Test
    fun `Test Second Rob III Kt Solution`() {
        assertEquals(3, solutionKt.rob(intArrayOf(1,2,3)))
    }
}