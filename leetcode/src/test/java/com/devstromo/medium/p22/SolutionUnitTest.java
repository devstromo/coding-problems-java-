package com.devstromo.medium.p22;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Generate Parentheses")
    void testGenerateParentheses() {
        var result = solution.generateParenthesis(3);
        var expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
        assertEquals(List.of("()"), solution.generateParenthesis(1));
    }

    @Test
    @DisplayName("Test Generate Parentheses Best")
    void testGenerateParenthesesBest() {
        var result = solution.generateParenthesisBest(3);
        var expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
        assertEquals(List.of("()"), solution.generateParenthesisBest(1));
    }
}