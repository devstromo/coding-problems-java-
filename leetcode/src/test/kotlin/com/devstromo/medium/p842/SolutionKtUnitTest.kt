package com.devstromo.medium.p842

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Split Into Fibonacci`() {
        assertEquals(listOf(11, 0, 11, 11), solution.splitIntoFibonacci("1101111"))
        assertEquals(listOf<Int>(), solution.splitIntoFibonacci("112358130"))
        assertEquals(listOf<Int>(), solution.splitIntoFibonacci("0123"))
    }
}