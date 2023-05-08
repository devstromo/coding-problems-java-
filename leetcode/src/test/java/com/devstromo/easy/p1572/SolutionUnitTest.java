package com.devstromo.easy.p1572;

import static com.devstromo.easy.p1572.Solution.diagonalSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testDiagonalSum() {
        var input = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        assertEquals(25, diagonalSum(input));

        var input1 = new int[][] { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        assertEquals(8, diagonalSum(input1));

        var input2 = new int[][] { { 5 } };
        assertEquals(5, diagonalSum(input2));
    }

}