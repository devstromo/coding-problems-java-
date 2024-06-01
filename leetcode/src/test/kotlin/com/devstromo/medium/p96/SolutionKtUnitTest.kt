package com.devstromo.medium.p96

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    val solutionKt = SolutionKt()

    @Test
    fun `Test Binomial Num of unique different trees`() {
        assertEquals(1, solutionKt.numTrees(1))
        assertEquals(5, solutionKt.numTrees(3))
        assertEquals(1767263190, solutionKt.numTrees(19))
    }
}