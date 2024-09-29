package com.devstromo.medium.p64;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testMaximumNumPath() {
        assertEquals(7, solution.minPathSum(new int[][]{
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}
                })
        );

        assertEquals(12, solution.minPathSum(new int[][]{
                        {1, 2, 3},
                        {4, 5, 6}
                })
        );
    }

    @Test
    void testMaximumNumPathSpaceOptimized() {
        assertEquals(7, solution.minPathSumSpaceOptimized(new int[][]{
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}
                })
        );

        assertEquals(12, solution.minPathSumSpaceOptimized(new int[][]{
                        {1, 2, 3},
                        {4, 5, 6}
                })
        );
    }

}