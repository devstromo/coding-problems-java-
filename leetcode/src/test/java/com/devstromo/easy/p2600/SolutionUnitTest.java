package com.devstromo.easy.p2600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testKItemsWithMaximumSum() {
        assertEquals(2, solution.kItemsWithMaximumSum(3, 2, 0, 2));
        assertEquals(2, solution.kItemsWithMaximumSum(3, 2, 0, 2));
    }

}