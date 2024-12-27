package com.devstromo.easy.p495;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Find Poisoned Duration")
    void testFindPoisonedDuration() {
        assertEquals(4, solution.findPoisonedDuration(new int[]{1, 4}, 2));
        assertEquals(3, solution.findPoisonedDuration(new int[]{1, 2}, 2));
        assertEquals(0, solution.findPoisonedDuration(new int[]{0, 1, 4}, 0));
        assertEquals(9, solution.findPoisonedDuration(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    @DisplayName("Best Solution for Find Poisoned Duration Problem")
    void testFindPoisonedDurationBest() {
        assertEquals(4, solution.findPoisonedDurationBest(new int[]{1, 4}, 2));
        assertEquals(3, solution.findPoisonedDurationBest(new int[]{1, 2}, 2));
        assertEquals(0, solution.findPoisonedDurationBest(new int[]{0, 1, 4}, 0));
        assertEquals(9, solution.findPoisonedDurationBest(new int[]{1, 2, 3, 4, 5}, 5));
    }

}