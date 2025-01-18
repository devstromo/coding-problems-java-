package com.devstromo.medium.p139

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Word Break`() {
        assertTrue(solution.wordBreak("leetcode", listOf("leet", "code")))
        assertTrue(solution.wordBreak("applepenapple", listOf("apple", "pen")))
        assertFalse(solution.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
    }

    @Test
    fun `Test Word Break Best`() {
        assertTrue(solution.wordBreakBest("leetcode", listOf("leet", "code")))
        assertTrue(solution.wordBreakBest("applepenapple", listOf("apple", "pen")))
        assertFalse(solution.wordBreakBest("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
    }
}