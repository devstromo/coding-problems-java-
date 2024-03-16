package com.devstromo.easy.p283;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();


    @Test
    void testMoveZeros() {
        var nums = new int[]{0, 1, 0, 3, 12};
        var expected = new int[]{1, 3, 12, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void testMoveZeros2() {
        var nums = new int[]{0};
        var expected = new int[]{0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

}