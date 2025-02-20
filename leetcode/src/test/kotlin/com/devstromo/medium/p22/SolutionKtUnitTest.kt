package com.devstromo.medium.p22

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Generate Parentheses`() {
        val result = solution.generateParenthesis(3)
        val expected = listOf("((()))", "(()())", "(())()", "()(())", "()()()")
        assertTrue(result.containsAll(expected) && expected.containsAll(result))
        assertEquals(listOf("()"), solution.generateParenthesis(1))
    }

    @Test
    fun `Test Generate Parentheses Best`() {
        val result = solution.generateParenthesisBest(3)
        val expected = listOf("((()))", "(()())", "(())()", "()(())", "()()()")
        assertTrue(result.containsAll(expected) && expected.containsAll(result))
        assertEquals(listOf("()"), solution.generateParenthesisBest(1))
    }
}