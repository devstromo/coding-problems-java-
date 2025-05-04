package com.devstromo.medium.p2266;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Count Number of Texts")
    void testCountNumberOfTexts() {
        assertEquals(8, solution.countTexts("22233"));
        assertEquals(82876089, solution.countTexts("222222222222222222222222222222222222"));

    }
}