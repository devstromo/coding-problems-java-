package com.devstromo.easy.p733;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Flood Fill")
    void testFloodFill() {
        assertTrue(Arrays.deepEquals(new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        }, solution.floodFill(new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        }, 1, 1, 2)));

        assertTrue(
                Arrays.deepEquals(new int[][]{
                        {0, 0, 0},
                        {0, 0, 0},
                }, solution.floodFill(new int[][]{
                        {0, 0, 0},
                        {0, 0, 0}
                }, 0, 0, 0))
        );
    }

}