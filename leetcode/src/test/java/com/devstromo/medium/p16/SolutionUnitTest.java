package com.devstromo.medium.p16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testThreeSumClosest() {
        assertEquals(2, solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        assertEquals(0, solution.threeSumClosest(new int[]{0, 0, 0}, 1));
    }

}