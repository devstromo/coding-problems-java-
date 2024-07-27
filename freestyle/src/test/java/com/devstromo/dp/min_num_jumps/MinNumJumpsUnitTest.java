package com.devstromo.dp.min_num_jumps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinNumJumpsUnitTest {
    private final MinNumJumps minNumJumps = new MinNumJumps();

    @Test
    public void testSolutionRecursive() {
        assertEquals(3, minNumJumps.recursive(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
        assertEquals(10, minNumJumps.recursive(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testSolutionUsingMemoization() {
        assertEquals(3, minNumJumps.recursiveMemo(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
        assertEquals(10, minNumJumps.recursiveMemo(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testSolutionUsingTabulation() {
        assertEquals(3, minNumJumps.tabulation(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
        assertEquals(10, minNumJumps.tabulation(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testSolutionOptimized() {
        assertEquals(3, minNumJumps.optimized(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
        assertEquals(10, minNumJumps.optimized(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }


}