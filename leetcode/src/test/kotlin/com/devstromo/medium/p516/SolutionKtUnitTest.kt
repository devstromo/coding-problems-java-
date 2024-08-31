package com.devstromo.medium.p516

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {

    private val solution = SolutionKt()

    @Test
    fun `Test Longest Palindrome Subsequence`() {
        assertEquals(4, solution.longestPalindromeSubseq("bbbab"))
        assertEquals(2, solution.longestPalindromeSubseq("cbbd"))
    }

}
