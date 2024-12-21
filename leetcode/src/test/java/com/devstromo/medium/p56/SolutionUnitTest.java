package com.devstromo.medium.p56;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testMerge() {
        assertArrayEquals(new int[][]{
                {1, 6}, {8, 10}, {15, 18}
        }, solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
        assertArrayEquals(new int[][]{
                {1, 5}
        }, solution.merge(new int[][]{{1, 4}, {4, 5}}));
    }

    @Test
    void testMergeBest() {
        assertArrayEquals(new int[][]{
                {1, 6}, {8, 10}, {15, 18}
        }, solution.mergeBest(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
        assertArrayEquals(new int[][]{
                {1, 5}
        }, solution.mergeBest(new int[][]{{1, 4}, {4, 5}}));
    }

}