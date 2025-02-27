package com.devstromo.medium.p1034;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Coloring A Border")
    void testColoringABorder() {
        assertArrayEquals(
                new int[][]{
                        {3, 3},
                        {3, 2}
                },
                solution.colorBorder(new int[][]{
                        {1, 1},
                        {1, 2}
                }, 0, 0, 3)
        );
        assertArrayEquals(
                new int[][]{
                        {1, 3, 3},
                        {2, 3, 3}
                },
                solution.colorBorder(new int[][]{
                        {1, 2, 2},
                        {2, 3, 2}
                }, 0, 1, 3)
        );
        assertArrayEquals(
                new int[][]{
                        {2, 2, 2},
                        {2, 1, 2},
                        {2, 2, 2}
                },
                solution.colorBorder(new int[][]{
                        {1, 1, 1},
                        {1, 1, 1},
                        {1, 1, 1}
                }, 1, 1, 2)
        );
    }
}