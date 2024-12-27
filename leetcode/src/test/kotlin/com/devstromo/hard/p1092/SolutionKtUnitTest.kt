package com.devstromo.hard.p1092

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Shortest Common Supersequence`() {
        assertEquals("cabac", solution.shortestCommonSupersequence("abac", "cab"))
        assertEquals("aaaaaaaa", solution.shortestCommonSupersequence("aaaaaaaa", "aaaaaaaa"))
    }
}