package com.devstromo.medium.p139;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Word Break")
    void testWordBreak() {
        assertTrue(solution.wordBreak("leetcode", List.of("leet", "code")));
        assertTrue(solution.wordBreak("applepenapple", List.of("apple", "pen")));
        assertFalse(solution.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    @DisplayName("Test Word Break Best")
    void testWordBreakBest() {
        assertTrue(solution.wordBreakBest("leetcode", List.of("leet", "code")));
        assertTrue(solution.wordBreakBest("applepenapple", List.of("apple", "pen")));
        assertFalse(solution.wordBreakBest("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }
}