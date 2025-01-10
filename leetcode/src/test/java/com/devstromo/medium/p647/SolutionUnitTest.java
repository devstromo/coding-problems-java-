package com.devstromo.medium.p647;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Count Palindromic Substrings")
    void testCountSubstrings() {
        assertEquals(3, solution.countSubstrings("abc"));
        assertEquals(6, solution.countSubstrings("aaa"));
    }

    @Test
    @DisplayName("Test Count Palindromic Substrings Best")
    void testCountSubstringsBest() {
        assertEquals(3, solution.countSubstringsBest("abc"));
        assertEquals(6, solution.countSubstringsBest("aaa"));
    }
}