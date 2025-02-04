package com.devstromo.hard.p132;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Palindrome Partitioning II")
    void palindromePartitioningII() {
        assertEquals(1, solution.minCut("aab"));
        assertEquals(0, solution.minCut("a"));
        assertEquals(1, solution.minCut("ab"));
    }

}