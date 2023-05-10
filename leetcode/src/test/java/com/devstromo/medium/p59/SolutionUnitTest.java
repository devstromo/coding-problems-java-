package com.devstromo.medium.p59;

import static com.devstromo.medium.p59.Solution.generateMatrix;
import static com.devstromo.medium.p59.Solution.generateMatrixBestSolution;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testGenerateMatrix() {
        var n = 1;
        var expected = new int[][] { { 1 } };
        assertArrayEquals(expected, generateMatrix(n));

        n = 3;
        expected = new int[][] { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
        assertArrayEquals(expected, generateMatrix(n));
    }

    @Test
    void testGenerateMatrixBestSolution() {
        var n = 1;
        var expected = new int[][] { { 1 } };
        assertArrayEquals(expected, generateMatrixBestSolution(n));

        n = 3;
        expected = new int[][] { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
        assertArrayEquals(expected, generateMatrixBestSolution(n));
    }
}