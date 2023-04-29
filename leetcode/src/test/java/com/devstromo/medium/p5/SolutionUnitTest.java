package com.devstromo.medium.p5;

import static com.devstromo.medium.p5.Solution.longestPalindrome;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    @Test
    public void testLongestPalindrome() {
        assertEquals("aba", longestPalindrome("babad"));
        assertEquals("bb", longestPalindrome("cbbd"));
    }
}