package com.devstromo.medium.p97;

import static com.devstromo.medium.p97.Solution.isInterleave;
import static com.devstromo.medium.p97.Solution.isInterleaveBestMemory;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testIsInterleave() {
        assertTrue(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    void testIsInterleave2() {
        assertTrue(isInterleave("", "", ""));
    }

    @Test
    void testIsInterleave3() {
        assertTrue(isInterleave("a", "", "a"));
    }

    @Test
    void testIsNotInterleave() {
        assertFalse(isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    void testIsInterleaveBestMemory() {
        assertTrue(isInterleaveBestMemory("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    void testIsInterleaveBestMemory2() {
        assertTrue(isInterleaveBestMemory("", "", ""));
    }

    @Test
    void testIsInterleaveBestMemory3() {
        assertTrue(isInterleaveBestMemory("a", "", "a"));
    }

    @Test
    void testIsNotInterleaveBestMemory() {
        assertFalse(isInterleaveBestMemory("aabcc", "dbbca", "aadbbbaccc"));
    }

}