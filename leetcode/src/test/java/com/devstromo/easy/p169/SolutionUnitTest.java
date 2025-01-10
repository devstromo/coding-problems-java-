package com.devstromo.easy.p169;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Majority Element")
    void testMajorityElement() {
        assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

}