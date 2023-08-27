package com.devstromo.easy.p459;

import static com.devstromo.easy.p459.Solution.repeatedSubstringPattern;
import static com.devstromo.easy.p459.Solution.repeatedSubstringPatternBest;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testRepeatedSubstringPattern() {
        assertTrue(repeatedSubstringPattern("abab"));
    }

    @Test
    void testRepeatedSubstringPattern2() {
        assertFalse(repeatedSubstringPattern("aba"));
    }

    @Test
    void testRepeatedSubstringPattern3() {
        assertTrue(repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    void testRepeatedSubstringPatternBest() {
        assertTrue(repeatedSubstringPatternBest("abab"));
    }

    @Test
    void testRepeatedSubstringPatternBest2() {
        assertFalse(repeatedSubstringPatternBest("aba"));
    }

    @Test
    void testRepeatedSubstringPatternBest3() {
        assertTrue(repeatedSubstringPatternBest("abcabcabcabc"));
    }
}