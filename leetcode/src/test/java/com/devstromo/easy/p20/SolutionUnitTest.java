package com.devstromo.easy.p20;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    Solution parentheses = new Solution();

    @Test
    public void testValidParentheses() {
        assertTrue(parentheses.isValid("()"));
        assertTrue(parentheses.isValid("()[]{}"));
    }

    @Test
    public void testNotValidParentheses() {
        assertFalse(parentheses.isValid("(]"));
        assertFalse(parentheses.isValid("(])"));
    }
}