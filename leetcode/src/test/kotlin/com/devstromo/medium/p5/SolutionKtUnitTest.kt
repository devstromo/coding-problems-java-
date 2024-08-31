package com.devstromo.medium.p5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Longest Palindrome`() {
        assertEquals("aba", solution.longestPalindrome("babad"))
        assertEquals("bb", solution.longestPalindrome("cbbd"))
    }
}