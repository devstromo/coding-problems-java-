package com.devstromo.medium.p15;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testThreeSum() {
        assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        assertEquals(List.of(), solution.threeSum(new int[]{0, 1, 1}));
        assertEquals(List.of(List.of(0, 0, 0)), solution.threeSum(new int[]{0, 0, 0}));

    }

}