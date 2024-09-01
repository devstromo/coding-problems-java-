package com.devstromo.easy.p2900

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Get Longest Subsequence Solution`() {
        assertEquals(listOf("e", "b"), solution.getLongestSubsequence(arrayOf("e", "a", "b"), intArrayOf(0, 0, 1)))
        assertEquals(
            listOf("a", "b", "c"),
            solution.getLongestSubsequence(arrayOf("a", "b", "c", "d"), intArrayOf(1, 0, 1, 1))
        )
        assertEquals(listOf("c"), solution.getLongestSubsequence(arrayOf("c"), intArrayOf(0)))
        assertEquals(listOf("d"), solution.getLongestSubsequence(arrayOf("d"), intArrayOf(1)))
        assertEquals(listOf("d", "g"), solution.getLongestSubsequence(arrayOf("d", "g"), intArrayOf(0, 1)))
    }
}