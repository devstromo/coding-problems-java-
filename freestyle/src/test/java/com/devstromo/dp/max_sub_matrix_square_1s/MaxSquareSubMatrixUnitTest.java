package com.devstromo.dp.max_sub_matrix_square_1s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSquareSubMatrixUnitTest {
    private final MaxSquareSubMatrix solution = new MaxSquareSubMatrix();

    @Test
    public void testMaxSubMatrix() {
        final var M = new int[][]
                {
                        {0, 1, 1, 0, 1},
                        {1, 1, 0, 1, 0},
                        {0, 1, 1, 1, 0},
                        {1, 1, 1, 1, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0}
                };
        assertEquals(3, solution.maxSubMatrix(M));
    }

    @Test
    public void testMaxSubMatrix2() {
        final var M = new int[][]
                {
                        {1, 1, 0, 1},
                        {1, 1, 1, 0},
                        {1, 1, 1, 1}
                };
        assertEquals(2, solution.maxSubMatrix(M));
    }

    @Test
    public void testMaxSubMatrixSpaceOptimized() {
        final var M = new int[][]
                {
                        {0, 1, 1, 0, 1},
                        {1, 1, 0, 1, 0},
                        {0, 1, 1, 1, 0},
                        {1, 1, 1, 1, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0}
                };
        assertEquals(3, solution.maxSubMatrixSpaceOptimized(M));
    }

    @Test
    public void testMaxSubMatrixSpaceOptimized2() {
        final var M = new int[][]
                {
                        {1, 1, 0, 1},
                        {1, 1, 1, 0},
                        {1, 1, 1, 1}
                };
        assertEquals(2, solution.maxSubMatrixSpaceOptimized(M));
    }
}