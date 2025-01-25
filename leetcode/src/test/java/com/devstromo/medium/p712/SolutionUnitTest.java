package com.devstromo.medium.p712;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Minimum ASCII Delete Sum for Two Strings")
    void testMinimumASCIIDeleteSumForTwoStrings() {
        assertEquals(231, solution.minimumDeleteSum("sea", "eat"));
        assertEquals(403, solution.minimumDeleteSum("delete", "leet"));
    }

    @Test
    @DisplayName("Test Minimum ASCII Delete Sum for Two Strings Best")
    void testMinimumASCIIDeleteSumForTwoStringsBest() {
        assertEquals(231, solution.minimumDeleteSumBest("sea", "eat"));
        assertEquals(403, solution.minimumDeleteSumBest("delete", "leet"));
    }
}