package com.devstromo.hard.p730;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Count Different Palindromic Subsequences")
    void testCountDifferentPalindromicSubsequences() {
        assertEquals(6, solution.countPalindromicSubsequences("bccb"));
        assertEquals(104860361, solution.countPalindromicSubsequences("abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"));
    }

}