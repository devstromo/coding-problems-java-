package com.devstromo.hard.p730

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Count Different Palindromic Subsequences`() {
        assertEquals(6, solution.countPalindromicSubsequences("bccb"))
        assertEquals(
            104860361,
            solution.countPalindromicSubsequences("abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba")
        )
    }
}