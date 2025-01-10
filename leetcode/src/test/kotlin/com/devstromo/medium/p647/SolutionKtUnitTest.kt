package com.devstromo.medium.p647

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Count Palindromic Substrings`() {
        assertEquals(3, solution.countSubstrings("abc"))
        assertEquals(6, solution.countSubstrings("aaa"))
    }

    @Test
    fun `Test Count Palindromic Substrings Best`() {
        assertEquals(3, solution.countSubstringsBest("abc"))
        assertEquals(6, solution.countSubstringsBest("aaa"))
    }
}