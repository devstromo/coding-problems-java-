package com.devstromo.easy.p263;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test is ugly")
    void testIsUgly() {
        assertTrue(solution.isUgly(5));
        assertTrue(solution.isUgly(6));
        assertFalse(solution.isUgly(14));
    }

}