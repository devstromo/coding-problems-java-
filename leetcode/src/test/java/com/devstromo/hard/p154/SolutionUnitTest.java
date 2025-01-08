package com.devstromo.hard.p154;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Find Minimum")
    void testFindMinimum() {
        assertEquals(1, solution.findMin(new int[]{1, 3, 5}));
        assertEquals(0, solution.findMin(new int[]{2, 2, 2, 0, 1}));
    }

}