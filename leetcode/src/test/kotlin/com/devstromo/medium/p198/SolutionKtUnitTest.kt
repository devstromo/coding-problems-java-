package com.devstromo.medium.p198

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    val solutionKt = SolutionKt()

    @Test
    fun `Test Rob Kt Solution`() {
        assertEquals(4, solutionKt.rob(intArrayOf(1, 2, 3, 1)))
    }

    @Test
    fun `Test Second Rob Kt Solution`() {
        assertEquals(12, solutionKt.rob(intArrayOf(2, 7, 9, 3, 1)))
    }
}