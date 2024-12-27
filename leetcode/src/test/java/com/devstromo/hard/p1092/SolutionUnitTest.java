package com.devstromo.hard.p1092;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testShortestCommonSupersequence() {
        assertEquals("cabac", solution.shortestCommonSupersequence("abac", "cab"));
        assertEquals("aaaaaaaa", solution.shortestCommonSupersequence("aaaaaaaa", "aaaaaaaa"));
    }

}