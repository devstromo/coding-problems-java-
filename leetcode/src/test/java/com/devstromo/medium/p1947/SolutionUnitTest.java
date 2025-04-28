package com.devstromo.medium.p1947;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Maximum Compatibility Score Sum")
    void testMaximumCompatibilityScoreSum() {
        assertEquals(8, solution.maxCompatibilitySum(
                new int[][]{
                        {1, 1, 0},
                        {1, 0, 1},
                        {0, 0, 1}
                },
                new int[][]{
                        {1, 0, 0},
                        {0, 0, 1},
                        {1, 1, 0}
                }
        ));
        assertEquals(0, solution.maxCompatibilitySum(
                new int[][]{
                        {0, 0},
                        {0, 0},
                        {0, 0},
                },
                new int[][]{
                        {1, 1},
                        {1, 1},
                        {1, 1},
                }
        ));
    }

    @Test
    @DisplayName("Test Maximum Compatibility Score Sum Best")
    void testMaximumCompatibilityScoreSumBest() {
        assertEquals(8, solution.maxCompatibilitySumBest(
                new int[][]{
                        {1, 1, 0},
                        {1, 0, 1},
                        {0, 0, 1}
                },
                new int[][]{
                        {1, 0, 0},
                        {0, 0, 1},
                        {1, 1, 0}
                }
        ));
        assertEquals(0, solution.maxCompatibilitySumBest(
                new int[][]{
                        {0, 0},
                        {0, 0},
                        {0, 0},
                },
                new int[][]{
                        {1, 1},
                        {1, 1},
                        {1, 1},
                }
        ));
    }
}