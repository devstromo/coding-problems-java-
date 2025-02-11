package com.devstromo.hard.p140;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Word Break II")
    void testWordBreak() {
        var expected = List.of("cats and dog", "cat sand dog");
        var result = solution.wordBreak("catsanddog", List.of("cat", "cats", "and", "sand", "dog"));
        assertTrue(expected.containsAll(result) && result.containsAll(expected));
        var expected2 = List.of("pine apple pen apple", "pineapple pen apple", "pine applepen apple");
        var result2 = solution.wordBreak("pineapplepenapple", List.of("apple", "pen", "applepen", "pine", "pineapple"));
        assertTrue(expected2.containsAll(result2) && result2.containsAll(expected2));
    }
}