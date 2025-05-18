package com.devstromo.dp.lcs.practice.swap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testNoSwapNeeded() {
        assertEquals(6, solution.lcsWithSwap("abcdef", "abcdef"));
    }

    @Test
    void testImprovedBySwap() {
        assertEquals(5, solution.lcsWithSwap("abcfde", "abcdef")); // best we can do
    }

    @Test
    void testSwapDoesNotHelp() {
        assertEquals(0, solution.lcsWithSwap("abc", "de")); // any swap won't help
    }

    @Test
    void testSingleCharMatch() {
        assertEquals(2, solution.lcsWithSwap("xyz", "aayz"));
    }

    @Test
    void testAllDifferent() {
        assertEquals(0, solution.lcsWithSwap("abc", "xyz"));
    }

    @Test
    void testAlreadyOptimalButSwapHurts() {
        assertEquals(3, solution.lcsWithSwap("abc", "abc")); // best is without swap
    }

}