package com.devstromo.medium.p1143

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    val solutionKt = SolutionKt()

    @Test
    fun `Test Longest Common Subsequence`() {
        assertEquals(3, solutionKt.longestCommonSubsequence("abcde", "ace"))
        assertEquals(3, solutionKt.longestCommonSubsequence("abc", "abc"))
        assertEquals(0, solutionKt.longestCommonSubsequence("abc", "def"))
    }
}