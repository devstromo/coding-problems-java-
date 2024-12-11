package com.devstromo.medium.p18;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testFourSum() {
        assertEquals(List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1)), solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        assertEquals(List.of(List.of(2, 2, 2, 2)), solution.fourSum(new int[]{2, 2, 2, 2, 2}, 8));

    }

}