package com.devstromo.dp.knapsack.knapsackWithBounds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testKnapsackUnbounded() {
        int n = 3;
        int w = 50;
        var weights = new int[]{10, 20, 30};
        var profits = new int[]{60, 100, 120};
        var result = solution.knapsackUnbounded(n, w, weights, profits);
        assertEquals(300, result);
    }

    @Test
    void testKnapsackUnbounded2() {
        int n = 4;
        int w = 8;
        var weights = new int[]{1, 2, 3, 5};
        var profits = new int[]{1, 4, 7, 10};
        var result = solution.knapsackUnbounded(n, w, weights, profits);
        assertEquals(18, result);
    }

}