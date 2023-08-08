package com.devstromo.easy.p2697;

import static com.devstromo.easy.p2697.Solution.makeSmallestPalindrome;
import static com.devstromo.easy.p2697.Solution.makeSmallestPalindromeBest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMakeSmallestPalindrome() {
        assertEquals("efcfe", makeSmallestPalindrome("egcfe"));
    }

    @Test
    void testMakeSmallestPalindrome2() {
        assertEquals("abba", makeSmallestPalindrome("abcd"));
    }

    @Test
    void testMakeSmallestPalindrome3() {
        assertEquals("neven", makeSmallestPalindrome("seven"));
    }

    @Test
    void testMakeSmallestPalindromeBestMemory() {
        assertEquals("efcfe", makeSmallestPalindromeBest("egcfe"));
    }

    @Test
    void testMakeSmallestPalindromeBestMemory2() {
        assertEquals("abba", makeSmallestPalindromeBest("abcd"));
    }

    @Test
    void testMakeSmallestPalindromeBestMemory3() {
        assertEquals("neven", makeSmallestPalindromeBest("seven"));
    }
}