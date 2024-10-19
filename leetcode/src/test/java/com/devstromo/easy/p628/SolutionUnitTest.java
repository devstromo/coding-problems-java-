package com.devstromo.easy.p628;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testMaximumProductOfThree() {
        assertEquals(6, solution.maximumProduct(new int[]{1, 2, 3}));
        assertEquals(24, solution.maximumProduct(new int[]{1, 2, 3, 4}));
        assertEquals(-6, solution.maximumProduct(new int[]{-1, -2, -3}));
        assertEquals(39200, solution.maximumProduct(new int[]{-100,-98,-1,2,3,4}));
    }


}