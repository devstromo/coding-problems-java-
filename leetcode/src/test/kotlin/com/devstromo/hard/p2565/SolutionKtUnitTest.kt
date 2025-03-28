package com.devstromo.hard.p2565

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Subsequence With the Minimum Score`() {
        assertEquals(1, solution.minimumScore("abacaba", "bzaa"))
        assertEquals(3, solution.minimumScore("cde", "xyz"))
    }
}