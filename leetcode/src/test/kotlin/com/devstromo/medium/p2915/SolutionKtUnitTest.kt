package com.devstromo.medium.p2915

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Length Of Longest Subsequence`() {
        assertEquals(3, solution.lengthOfLongestSubsequence(listOf(1, 2, 3, 4, 5), 9))
        assertEquals(4, solution.lengthOfLongestSubsequence(listOf(4, 1, 3, 2, 1, 5), 7))
        assertEquals(-1, solution.lengthOfLongestSubsequence(listOf(1, 1, 5, 4, 5), 3))
    }
}