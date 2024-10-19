package com.devstromo.medium.p238;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testProductExceptSelf() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    @Test
    public void testProductExceptSelfSpaceOptimized() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelfSpaceOptimized(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelfSpaceOptimized(new int[]{-1, 1, 0, -3, 3}));
    }

}