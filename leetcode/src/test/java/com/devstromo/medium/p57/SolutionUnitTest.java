package com.devstromo.medium.p57;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testInsertIntervals() {
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, solution.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}));
        assertArrayEquals(new int[][]{{5, 7}}, solution.insert(new int[][]{}, new int[]{5, 7}));
    }

    @Test
    void testInsertIntervalsBest() {
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, solution.insertBest(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}));
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, solution.insertBest(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}));
        assertArrayEquals(new int[][]{{5, 7}}, solution.insertBest(new int[][]{}, new int[]{5, 7}));
    }
}