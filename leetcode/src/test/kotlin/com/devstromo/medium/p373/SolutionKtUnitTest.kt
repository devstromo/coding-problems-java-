package com.devstromo.medium.p373

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun testKSmallestPairs() {
        assertEquals(
            listOf(listOf(1, 2), listOf(1, 4), listOf(1, 6)),
            solution.kSmallestPairs(intArrayOf(1, 7, 11), intArrayOf(2, 4, 6), 3)
        )
        assertEquals(
            listOf(listOf(1, 1), listOf(1, 1)),
            solution.kSmallestPairs(intArrayOf(1, 1, 2), intArrayOf(1, 2, 3), 2)
        )
    }
}