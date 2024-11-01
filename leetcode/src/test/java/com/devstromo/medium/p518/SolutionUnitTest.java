package com.devstromo.medium.p518;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testChangeCoinII() {
        assertEquals(4, solution.change(5, new int[]{1, 2, 5}));
        assertEquals(0, solution.change(3, new int[]{2}));
        assertEquals(1, solution.change(10, new int[]{10}));
    }

    @Test
    void testChangeCoinIIBest() {
        assertEquals(4, solution.changeBest(5, new int[]{1, 2, 5}));
        assertEquals(0, solution.changeBest(3, new int[]{2}));
        assertEquals(1, solution.changeBest(10, new int[]{10}));
    }

}