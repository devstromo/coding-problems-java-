package com.devstromo.hard.p354;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Max Envelopes")
    void testMaxEnvelopes() {
        assertEquals(3, solution.maxEnvelopes(new int[][]{
                {5, 4},
                {6, 4},
                {6, 7},
                {2, 3}
        }));

        assertEquals(1, solution.maxEnvelopes(new int[][]{
                {1, 1},
                {1, 1},
                {1, 1},
                {1, 1}
        }));
    }
}