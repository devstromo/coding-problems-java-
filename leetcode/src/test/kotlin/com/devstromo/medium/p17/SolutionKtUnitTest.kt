package com.devstromo.medium.p17

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Letter Combinations of a Phone Number`() {
        assertEquals(
            listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            solution.letterCombinations("23")
        )
        assertEquals(listOf<String>(), solution.letterCombinations(""))
        assertEquals(listOf("a", "b", "c"), solution.letterCombinations("2"))
    }
}