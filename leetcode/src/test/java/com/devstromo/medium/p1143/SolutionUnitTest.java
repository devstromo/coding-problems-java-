package com.devstromo.medium.p1143;

import static com.devstromo.medium.p1143.Solution.longestCommonSubsequence;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testLongestCommonSubsequence() {
        assertEquals(3, longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void testLongestCommonSubsequence2() {
        assertEquals(3, longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void testLongestCommonSubsequence3() {
        assertEquals(0, longestCommonSubsequence("abc", "def"));
    }
}