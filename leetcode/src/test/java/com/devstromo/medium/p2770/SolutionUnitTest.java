package com.devstromo.medium.p2770;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void solveMaximumJumps() {
        final var nums = new int[]{1, 3, 6, 4, 1, 2};
        assertEquals(3, solution.maximumJumps(nums, 2));
        assertEquals(5, solution.maximumJumps(nums, 3));
        assertEquals(-1, solution.maximumJumps(nums, 0));
        assertEquals(-1, solution.maximumJumps(new int[]{0, 2, 1, 3}, 1));
    }

    @Test
    void solveMaximumJumpsBestSolution() {
        final var nums = new int[]{1, 3, 6, 4, 1, 2};
        assertEquals(3, solution.maximumJumpsBestSolution(nums, 2));
        assertEquals(5, solution.maximumJumpsBestSolution(nums, 3));
        assertEquals(-1, solution.maximumJumpsBestSolution(nums, 0));
        assertEquals(-1, solution.maximumJumpsBestSolution(new int[]{0, 2, 1, 3}, 1));
    }

}