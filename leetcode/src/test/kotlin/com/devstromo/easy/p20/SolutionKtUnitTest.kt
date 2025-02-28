package com.devstromo.easy.p20

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Valid Parentheses`() {
        assertTrue(solution.isValid("()"))
        assertTrue(solution.isValid("()[]{}"))
        assertFalse(solution.isValid("(]"))
        assertFalse(solution.isValid("(])"))
    }

    @Test
    fun `Test Valid Parentheses Best`() {
        assertTrue(solution.isValidBest("()"))
        assertTrue(solution.isValidBest("()[]{}"))
        assertFalse(solution.isValidBest("(]"))
        assertFalse(solution.isValidBest("(])"))
    }
}