package com.devstromo.hard.p2565;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test  Subsequence With the Minimum Score")
    void testSubsequenceWithTheMinimumScore() {
        assertEquals(1, solution.minimumScore("abacaba", "bzaa"));
        assertEquals(3, solution.minimumScore("cde", "xyz"));
    }

}