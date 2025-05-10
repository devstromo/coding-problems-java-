package com.devstromo.medium.p17;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Letter Combinations of a Phone Number")
    void letterCombinations() {
        assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), solution.letterCombinations("23"));
        assertEquals(List.of(), solution.letterCombinations(""));
        assertEquals(List.of("a", "b", "c"), solution.letterCombinations("2"));
    }

}