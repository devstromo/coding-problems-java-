package com.devstromo.medium.p50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testMyPow() {
        assertEquals(1024.00000, solution.myPow(2.00000, 10));
        assertEquals(9.26100, solution.myPow(2.10000, 3));
        assertEquals(0.25000, solution.myPow(2.00000, -2));
    }

}