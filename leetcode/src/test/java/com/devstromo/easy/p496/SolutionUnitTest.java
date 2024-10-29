package com.devstromo.easy.p496;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testNextGreaterElement() {
        assertArrayEquals(new int[]{-1, 3, -1}, solution.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        assertArrayEquals(new int[]{3, -1}, solution.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }

    @Test
    void testNextGreaterElementBest() {
        assertArrayEquals(new int[]{-1, 3, -1}, solution.nextGreaterElementBest(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        assertArrayEquals(new int[]{3, -1}, solution.nextGreaterElementBest(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }

    @Test
    void testNextGreaterElementBestVariant() {
        assertArrayEquals(new int[]{-1, 3, -1}, solution.nextGreaterElementBestVariant(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        assertArrayEquals(new int[]{3, -1}, solution.nextGreaterElementBestVariant(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }
}