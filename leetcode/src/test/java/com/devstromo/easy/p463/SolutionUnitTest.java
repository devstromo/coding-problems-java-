package com.devstromo.easy.p463;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Island Perimeter")
    void testIslandPerimeter() {
        assertEquals(16, solution.islandPerimeter(new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        }));
        assertEquals(4, solution.islandPerimeter(new int[][]{
                {1}
        }));
        assertEquals(4, solution.islandPerimeter(new int[][]{
                {1, 0}
        }));
    }

}