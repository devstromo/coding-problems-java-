package com.devstromo.dp.lis.practice.with_k_replacement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Longest Increasing Subsequence with k Replacements")
    void testLongestIncreasingSubsequenceWithKReplacements() {
        int[] nums = {5, 3, 4, 2, 6};
        int k = 1;
        assertEquals(4, solution.longestIncreasingSubsequenceWithKReplacements(nums, k));
    }

    @Test
    @DisplayName("Test No Replacement Needed")
    void testNoReplacementNeeded() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 0;
        assertEquals(5, solution.longestIncreasingSubsequenceWithKReplacements(nums, k));
    }

    @Test
    @DisplayName("Test One Replacement To Start")
    void testOneReplacementToStart() {
        int[] nums = {5, 1, 2, 3, 4};
        int k = 1;
        assertEquals(5, solution.longestIncreasingSubsequenceWithKReplacements(nums, k));
    }

    @Test
    @DisplayName("Test Max Replacements")
    void testMaxReplacements() {
        int[] nums = {9, 8, 7, 6, 5};
        int k = 4;
        assertEquals(5, solution.longestIncreasingSubsequenceWithKReplacements(nums, k));
    }

    @Test
    @DisplayName("Test Zero LIS")
    void testZeroLIS() {
        int[] nums = {5, 5, 5, 5};
        int k = 0;
        assertEquals(1, solution.longestIncreasingSubsequenceWithKReplacements(nums, k));
    }
}