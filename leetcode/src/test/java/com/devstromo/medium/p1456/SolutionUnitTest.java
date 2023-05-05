package com.devstromo.medium.p1456;

import static com.devstromo.medium.p1456.Solution.maxVowels;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMaxVowels() {
        var input = "aeiou";
        var k = 2;
        assertEquals(2, maxVowels(input, k));
        input = "abciiidef";
        k = 3;
        assertEquals(3, maxVowels(input, k));
        input = "leetcode";
        k = 3;
        assertEquals(2, maxVowels(input, k));

    }

    @Test
    void testMaxVowelsK3() {
        var input = "abciiide";
        var k = 3;
        assertEquals(3, maxVowels(input, k));
    }

    @Test
    void testMaxVowelsK7() {
        var input = "weallloveyou";
        var k = 7;
        assertEquals(4, maxVowels(input, k));
    }
}