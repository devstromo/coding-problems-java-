package com.devstromo.easy.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    private final Solution lcp = new Solution();

    @Test
    public void testEmptyInput() {
        String[] input = {};
        String expected = "";
        assertEquals(expected, lcp.longestCommonPrefix(input));
    }

    @Test
    public void testSingleElement() {
        String[] input = {"hello"};
        String expected = "hello";
        assertEquals(expected, lcp.longestCommonPrefix(input));
    }

    @Test
    public void testCommonPrefix() {
        String[] input = {"flower", "flow", "flight"};
        String expected = "fl";
        assertEquals(expected, lcp.longestCommonPrefix(input));
    }

    @Test
    public void testNoCommonPrefix() {
        String[] input = {"dog", "racecar", "car"};
        String expected = "";
        assertEquals(expected, lcp.longestCommonPrefix(input));
    }

    @Test
    public void testMixedLengths() {
        String[] input = {"abcdefgh", "abcde", "abcd"};
        String expected = "abcd";
        assertEquals(expected, lcp.longestCommonPrefix(input));
    }

}