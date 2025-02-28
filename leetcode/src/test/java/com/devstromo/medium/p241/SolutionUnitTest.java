package com.devstromo.medium.p241;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Different Ways to Add Parentheses")
    void testDifferentWaysToAddParentheses() {
        var expected = List.of(0, 2);
        var result = solution.diffWaysToCompute("2-1-1");
        assertTrue(expected.containsAll(result) && result.containsAll(expected));
        var expected1 = List.of(-34, -14, -10, -10, 10);
        var result1 = solution.diffWaysToCompute("2*3-4*5");
        assertTrue(expected1.containsAll(result1) && result1.containsAll(expected1));

    }
}