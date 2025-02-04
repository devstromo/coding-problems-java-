package com.devstromo.medium.p131;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Palindrome Partitioning")
    void testPalindromePartitioning() {
        assertEquals(List.of(List.of("a", "a", "b"), List.of("aa", "b")), solution.partition("aab"));
        assertEquals(List.of(List.of("a")), solution.partition("a"));
    }

    @Test
    @DisplayName("Test Palindrome Partitioning Best")
    void testPalindromePartitioningBest() {
        assertEquals(List.of(List.of("a", "a", "b"), List.of("aa", "b")), solution.partitionBest("aab"));
        assertEquals(List.of(List.of("a")), solution.partitionBest("a"));
    }

}