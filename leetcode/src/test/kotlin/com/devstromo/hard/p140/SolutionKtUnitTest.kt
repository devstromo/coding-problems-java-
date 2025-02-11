package com.devstromo.hard.p140

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Word Break II`() {
        val expected = listOf("cats and dog", "cat sand dog")
        val result = solution.wordBreak("catsanddog", listOf("cat", "cats", "and", "sand", "dog"))
        assertTrue(expected.containsAll(result) && result.containsAll(expected))
        val expected2 = listOf("pine apple pen apple", "pineapple pen apple", "pine applepen apple")
        val result2 = solution.wordBreak("pineapplepenapple", listOf("apple", "pen", "applepen", "pine", "pineapple"))
        assertTrue(expected2.containsAll(result2) && result2.containsAll(expected2))
    }
}