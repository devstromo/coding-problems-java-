package com.devstromo.hard.p84;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testLargestRectangleArea() {
        assertEquals(10, solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        assertEquals(4, solution.largestRectangleArea(new int[]{2, 4}));
    }

    @Test
    public void testLargestRectangleAreaBest() {
        assertEquals(10, solution.largestRectangleAreaBest(new int[]{2, 1, 5, 6, 2, 3}));
        assertEquals(4, solution.largestRectangleAreaBest(new int[]{2, 4}));
    }

}