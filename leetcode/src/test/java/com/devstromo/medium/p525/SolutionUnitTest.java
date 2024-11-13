package com.devstromo.medium.p525;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testFindMaxLength() {
        assertEquals(2, solution.findMaxLength(new int[]{0, 1}));
        assertEquals(2, solution.findMaxLength(new int[]{0, 1, 0}));
    }

}