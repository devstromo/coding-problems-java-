package com.devstromo.medium.p1306;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testCanJump3() {
        assertTrue(solution.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5));
        assertTrue(solution.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 0));
        assertFalse(solution.canReach(new int[]{3, 0, 2, 1, 2}, 2));
    }

    @Test
    public void testCanJump3Recursive() {
        assertTrue(solution.canReachRecursive(new int[]{4, 2, 3, 0, 3, 1, 2}, 5));
        assertTrue(solution.canReachRecursive(new int[]{4, 2, 3, 0, 3, 1, 2}, 0));
        assertFalse(solution.canReachRecursive(new int[]{3, 0, 2, 1, 2}, 2));
    }
}