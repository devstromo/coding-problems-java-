package com.devstromo.dp.min_cost_path;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostPathUnitTest {
    private final MinCostPath minCostPath = new MinCostPath();

    @Test
    public void testMinCostPathRecursive() {
        var costs = new int[][]{
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}
        };
        assertEquals(8, minCostPath.recursive(costs));
    }

    @Test
    public void testMinCostPathDp2d() {
        var costs = new int[][]{
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}
        };
        assertEquals(8, minCostPath.dp2D(costs));
    }

    @Test
    public void testMinCostPathMemoized() {
        var costs = new int[][]{
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}
        };
        assertEquals(8, minCostPath.memoized(costs));
    }

    @Test
    public void testMinCostPathSpaceOptimized() {
        var costs = new int[][]{
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}
        };
        assertEquals(8, minCostPath.spaceOptimized(costs));
    }

    @Test
    public void testMinCostPathDijkstra() {
        var costs = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        assertEquals(45, minCostPath.minCostPathDijkstra(costs));
    }

    @Test
    public void testMinCostToMN() {
        var costs = new int[][]{
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}
        };
        assertEquals(2, minCostPath.minCostToMN(costs, 2, 2));
    }
}