package com.devstromo.medium.p556;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    void testNextGreaterElementIII() {
        assertEquals(21, solution.nextGreaterElement(12));
        assertEquals(-1, solution.nextGreaterElement(21));
    }

}