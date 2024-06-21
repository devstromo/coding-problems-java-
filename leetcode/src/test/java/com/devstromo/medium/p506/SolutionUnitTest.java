package com.devstromo.medium.p506;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void test() {
        assertEquals(2, solution.subarraySum(new int[]{1, 2, 3}, 3));
        assertEquals(2, solution.subarraySum(new int[]{1, 1, 1}, 2));
        var largeNums = new int[]{1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4};
        assertEquals(0, solution.subarraySum(largeNums, 100));
    }

}