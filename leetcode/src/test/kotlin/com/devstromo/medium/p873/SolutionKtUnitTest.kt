package com.devstromo.medium.p873

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Length Longest Fib Subsequence`() {
        assertEquals(5, solution.lenLongestFibSubseq(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)))
        assertEquals(3, solution.lenLongestFibSubseq(intArrayOf(1, 3, 7, 11, 12, 14, 18)))
    }
}