package com.devstromo.medium.p2101;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Detonate the Maximum Bombs")
    void testDetonation() {
        assertEquals(2, solution.maximumDetonation(
                new int[][]{
                        {2, 1, 3},
                        {6, 1, 4},
                }
        ));
        assertEquals(1, solution.maximumDetonation(
                new int[][]{
                        {1, 1, 5},
                        {10, 10, 5},
                }
        ));
        assertEquals(5, solution.maximumDetonation(
                new int[][]{
                        {1, 2, 3},
                        {2, 3, 1},
                        {3, 4, 2},
                        {4, 5, 3},
                        {5, 6, 4}
                }
        ));
    }

}