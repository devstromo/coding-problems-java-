package com.devstromo.medium.p3129;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testNumberOfStableArrays() {
        assertEquals(2, solution.numberOfStableArrays(1, 1, 2));
        assertEquals(1, solution.numberOfStableArrays(1, 2, 1));
        assertEquals(14, solution.numberOfStableArrays(3, 3, 2));
    }

}