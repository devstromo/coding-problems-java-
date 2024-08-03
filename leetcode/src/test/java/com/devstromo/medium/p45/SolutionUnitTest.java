package com.devstromo.medium.p45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testJump() {
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, solution.jump(new int[]{2,3,0,1,4}));
    }

}