package com.devstromo.easy.p2600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testKItemsWithMaximumSum() {
        assertEquals(2, solution.kItemsWithMaximumSum(3, 2, 0, 2));
        assertEquals(3, solution.kItemsWithMaximumSum(3, 2, 0, 4));
    }

    @Test
    void testKItemsWithMaximumSumBest() {
        assertEquals(2, solution.kItemsWithMaximumSumBest(3, 2, 0, 2));
        assertEquals(3, solution.kItemsWithMaximumSumBest(3, 2, 0, 4));
    }

}