package com.devstromo.medium.p322;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testCoinChange() {
        assertEquals(3, solution.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void testCoinChange2() {
        assertEquals(-1, solution.coinChange(new int[]{2}, 3));
    }

    @Test
    public void testCoinChange3() {
        assertEquals(0, solution.coinChange(new int[]{1}, 0));
    }

}