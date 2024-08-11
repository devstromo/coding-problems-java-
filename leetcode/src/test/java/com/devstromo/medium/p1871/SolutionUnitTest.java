package com.devstromo.medium.p1871;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testJumpGameRecursive() {
        assertTrue(solution.canReachRecursive("011010", 2, 3));
        assertFalse(solution.canReachRecursive("01101110", 2, 3));
    }

}