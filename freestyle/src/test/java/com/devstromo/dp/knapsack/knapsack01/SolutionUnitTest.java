package com.devstromo.dp.knapsack.knapsack01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

    @Test
    void testKnapsack01With1DArray() {
        int n = 3;
        int w = 50;
        var weights = new int[]{10, 20, 30};
        var profits = new int[]{60, 100, 120};
        assertEquals(220, solution.knapsack01With1DArray(n, w, weights, profits));
    }

    @Test
    void testKnapsack01With1DArrayTest2() {
        int n = 4;
        int w = 5;
        var weights = new int[]{3, 1, 2, 1};
        var profits = new int[]{2000, 1000, 1500, 500};
        assertEquals(3500, solution.knapsack01With1DArray(n, w, weights, profits));
    }

    @Test
    void testKnapsack01SelectedItems() {
        int n = 3;
        int w = 50;
        var weights = new int[]{10, 20, 30};
        var profits = new int[]{60, 100, 120};
        var expectedResult = new int[]{0, 1, 1};
        var result = solution.knapsack01Selected(n, w, weights, profits);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void testKnapsack01SelectedItems2() {
        int n = 4;
        int w = 5;
        var weights = new int[]{3, 1, 2, 1};
        var profits = new int[]{2000, 1000, 1500, 500};
        var expectedResult = new int[]{1, 0, 1, 0};
        var result = solution.knapsack01Selected(n, w, weights, profits);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void testKnapsack01With1DArraySelectedItems() {
        int n = 3;
        int w = 50;
        var weights = new int[]{10, 20, 30};
        var profits = new int[]{60, 100, 120};
        var expectedResult = new int[]{0, 1, 1};
        var result = solution.knapsack01With1DArraySelected(n, w, weights, profits);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void testKnapsack01With1DArraySelectedItems2() {
        int n = 4;
        int w = 5;
        var weights = new int[]{3, 1, 2, 1};
        var profits = new int[]{2000, 1000, 1500, 500};
        var expectedResult = new int[]{1, 0, 1, 0};
        var result = solution.knapsack01With1DArraySelected(n, w, weights, profits);
        assertArrayEquals(expectedResult, result);
    }

}