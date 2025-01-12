package com.devstromo.hard.p1312;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Minimum Insertion Steps to Make a String Palindrome")
    void testMinInsertions() {
        assertEquals(0, solution.minInsertions("zzazz"));
        assertEquals(2, solution.minInsertions("mbadm"));
        assertEquals(5, solution.minInsertions("leetcode"));
    }

    @Test
    @DisplayName("Test Minimum Insertion Steps to Make a String Palindrome Best")
    void testMinInsertionsBest() {
        assertEquals(0, solution.minInsertionsBest("zzazz"));
        assertEquals(2, solution.minInsertionsBest("mbadm"));
        assertEquals(5, solution.minInsertionsBest("leetcode"));
    }

}