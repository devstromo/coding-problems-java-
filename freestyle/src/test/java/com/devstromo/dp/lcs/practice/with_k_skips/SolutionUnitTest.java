package com.devstromo.dp.lcs.practice.with_k_skips;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solver = new Solution();

    @Test
    void basicTest() {
        String text1 = "abcde";
        String text2 = "acebd";
        int k = 1;
        assertEquals(3, solver.longestCommonSubsequenceWithSkips(text1, text2, k));
    }

    @Test
    void testNoSkipsSameAsLCS() {
        String text1 = "abc";
        String text2 = "abc";
        int k = 0;
        assertEquals(3, solver.longestCommonSubsequenceWithSkips(text1, text2, k));
    }

    @Test
    void testWithSkipsImprovesLCS() {
        String text1 = "abcxyz";
        String text2 = "axyz";
        int k = 1;
        assertEquals(4, solver.longestCommonSubsequenceWithSkips(text1, text2, k));
    }

    @Test
    void testEmptyString() {
        String text1 = "";
        String text2 = "abc";
        int k = 2;
        assertEquals(0, solver.longestCommonSubsequenceWithSkips(text1, text2, k));
    }

    @Test
    void testSkipsUnused() {
        String text1 = "abcdef";
        String text2 = "acef";
        int k = 3;
        assertEquals(4, solver.longestCommonSubsequenceWithSkips(text1, text2, k));
    }

    @Test
    void testAllSkipsNeeded() {
        String text1 = "abc";
        String text2 = "xyz";
        int k = 3;
        assertEquals(0, solver.longestCommonSubsequenceWithSkips(text1, text2, k));
    }

}