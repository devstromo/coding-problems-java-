package com.devstromo.hard.p132

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    @DisplayName("Palindrome Partitioning II")
    fun `Test Palindrome Partitioning II`() {
        assertEquals(1, solution.minCut("aab"))
        assertEquals(0, solution.minCut("a"))
        assertEquals(1, solution.minCut("ab"))
    }
}