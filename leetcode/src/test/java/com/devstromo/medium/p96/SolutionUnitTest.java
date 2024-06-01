package com.devstromo.medium.p96;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testNumTrees() {
        assertEquals(5, solution.numTrees(3));
        assertEquals(1, solution.numTrees(1));
        assertEquals(1767263190, solution.numTrees(19));
    }

}