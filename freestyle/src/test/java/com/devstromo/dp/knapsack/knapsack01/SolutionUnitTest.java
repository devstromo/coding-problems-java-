package com.devstromo.dp.knapsack.knapsack01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testKnapsack01() {
        int n = 3;
        int w = 50;
        var weights = new int[]{10, 20, 30};
        var profits = new int[]{60, 100, 120};
        assertEquals(220, solution.knapsack01(n, w, weights, profits));
    }

    @Test
    void testKnapsack01Test2() {
        int n = 4;
        int w = 5;
        var weights = new int[]{3, 1, 2, 1};
        var profits = new int[]{2000, 1000, 1500, 500};
        assertEquals(3500, solution.knapsack01(n, w, weights, profits));
    }
}