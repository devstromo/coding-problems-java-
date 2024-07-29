package com.devstromo.medium.p55;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testCanJump() {
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

}