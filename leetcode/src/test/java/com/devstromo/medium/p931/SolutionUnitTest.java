package com.devstromo.medium.p931;

import static com.devstromo.medium.p931.Solution.minFallingPathSum;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMinFallingPathSum() {
        assertEquals(13, minFallingPathSum(new int[][] { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } }));
    }

    @Test
    void testMinFallingPathSum2() {
        assertEquals(-59, minFallingPathSum(new int[][] { { -19, 57 }, { -40, -5 } }));
    }
}