package com.devstromo.medium.p934;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    Solution solution = new Solution();

    @Test
    void testShortestBridge() {
        int[][] grid = { { 0, 1 }, { 1, 0 } };
        assertEquals(1, solution.shortestBridge(grid));
    }

    @Test
    void testShortestBridge2() {
        int[][] grid = { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
        assertEquals(2, solution.shortestBridge(grid));
    }

    @Test
    void testShortestBridge3() {
        int[][] grid = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
        assertEquals(1, solution.shortestBridge(grid));
    }

    @Test
    void testShortestBridgeMemory() {
        int[][] grid = { { 0, 1 }, { 1, 0 } };
        assertEquals(1, solution.shortestBridgeBestMemory(grid));
    }

    @Test
    void testShortestBridgeMemory2() {
        int[][] grid = { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
        assertEquals(2, solution.shortestBridgeBestMemory(grid));
    }

    @Test
    void testShortestBridgeMemory3() {
        int[][] grid = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
        assertEquals(1, solution.shortestBridgeBestMemory(grid));
    }

}