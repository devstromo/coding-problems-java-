package com.devstromo.easy.p338;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    Solution solution = new Solution();

    @Test
    void testCountBits() {
        assertArrayEquals(new int[] { 0, 1, 1 }, solution.countBits(2));
        assertArrayEquals(new int[] { 0, 1, 1, 2, 1, 2 }, solution.countBits(5));
    }

    @Test
    void testCountBitsRecursive() {
        assertArrayEquals(new int[] { 0, 1, 1 }, solution.countBitsRecursive(2));
        assertArrayEquals(new int[] { 0, 1, 1, 2, 1, 2 }, solution.countBitsRecursive(5));
    }

}