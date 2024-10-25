package com.devstromo.medium.p794

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solutionKt = SolutionKt()

    @Test
    fun `Test Find Target Sum Ways`() {
        assertEquals(5, solutionKt.findTargetSumWays(intArrayOf(1, 1, 1, 1, 1), 3))
        assertEquals(1, solutionKt.findTargetSumWays(intArrayOf(1), 1))
    }
}