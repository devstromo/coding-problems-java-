package com.devstromo.medium.p516;

import static com.devstromo.medium.p516.Solution.longestPalindromeSubseq;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testLongestPalindromeSubseq() {
        assertEquals(4, longestPalindromeSubseq("bbbab"));
    }

    @Test
    void testLongestPalindromeSubseq1() {
        assertEquals(2, longestPalindromeSubseq("cbbd"));
    }
}