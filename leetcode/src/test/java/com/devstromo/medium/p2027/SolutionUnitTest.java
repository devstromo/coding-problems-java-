package com.devstromo.medium.p2027;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Extra Characters in a String")
    void testExtraCharactersInString() {
        assertEquals(1, solution.minExtraChar("leetscode", new String[]{"leet", "code", "leetcode"}));
        assertEquals(3, solution.minExtraChar("sayhelloworld", new String[]{"hello", "world"}));
    }

    @Test
    @DisplayName("Test Extra Characters in a String Trie")
    void testExtraCharactersInStringTrie() {
        assertEquals(1, solution.minExtraCharTrie("leetscode", new String[]{"leet", "code", "leetcode"}));
        assertEquals(3, solution.minExtraCharTrie("sayhelloworld", new String[]{"hello", "world"}));
    }
}