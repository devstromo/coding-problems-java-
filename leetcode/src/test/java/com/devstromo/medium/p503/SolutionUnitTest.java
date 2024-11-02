package com.devstromo.medium.p503;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testNextGreaterElementCircular() {
        assertArrayEquals(new int[]{2, -1, 2}, solution.nextGreaterElements(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{2, 3, 4, -1, 4}, solution.nextGreaterElements(new int[]{1, 2, 3, 4, 3}));
    }

}