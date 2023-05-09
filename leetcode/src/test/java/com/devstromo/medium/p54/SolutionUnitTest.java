package com.devstromo.medium.p54;

import static com.devstromo.medium.p54.Solution.spiralOrder;
import static com.devstromo.medium.p54.Solution.spiralOrderBestSubmit;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testSpiralOrder() {
        var matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        var result = spiralOrder(matrix);
        assertArrayEquals(new Integer[] { 1, 2, 3, 6, 9, 8, 7, 4, 5 }, result.toArray(new Integer[] {}));
    }

    @Test
    void testSpiralOrderLong() {
        var matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        var result = spiralOrder(matrix);
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7 }, result.toArray(new Integer[] {}));
    }

    @Test
    void testSpiralOrderBest() {
        var matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        var result = spiralOrderBestSubmit(matrix);
        assertArrayEquals(new Integer[] { 1, 2, 3, 6, 9, 8, 7, 4, 5 }, result.toArray(new Integer[] {}));
    }

    @Test
    void testSpiralOrderBestLong() {
        var matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        var result = spiralOrderBestSubmit(matrix);
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7 }, result.toArray(new Integer[] {}));
    }
}