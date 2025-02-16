package com.devstromo.medium.p1981;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Minimize the Difference Between Target and Chosen Elements")
    void testMinimizeDifferenceBetweenTargetAndChosenElements() {
        assertEquals(0, solution.minimizeTheDifference(
                        new int[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        }, 13
                )
        );
        assertEquals(94, solution.minimizeTheDifference(
                        new int[][]{
                                {1},
                                {2},
                                {3}
                        }, 100
                )
        );
        assertEquals(1, solution.minimizeTheDifference(
                        new int[][]{
                                {1, 2, 9, 8, 7},
                        }, 6
                )
        );
    }

    @Test
    @DisplayName("Test Minimize the Difference Between Target and Chosen Elements Best")
    void testMinimizeDifferenceBetweenTargetAndChosenElementsBest() {
        assertEquals(0, solution.minimizeTheDifferenceBest(
                        new int[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        }, 13
                )
        );
        assertEquals(94, solution.minimizeTheDifferenceBest(
                        new int[][]{
                                {1},
                                {2},
                                {3}
                        }, 100
                )
        );
        assertEquals(1, solution.minimizeTheDifferenceBest(
                        new int[][]{
                                {1, 2, 9, 8, 7},
                        }, 6
                )
        );
    }
}