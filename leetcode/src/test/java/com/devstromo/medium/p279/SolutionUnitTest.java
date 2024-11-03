package com.devstromo.medium.p279;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testNumSquares() {
        assertEquals(3, solution.numSquares(12));
        assertEquals(2, solution.numSquares(13));
    }

}