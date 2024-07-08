package com.devstromo.dp.edit_distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();
    @Test
    public void testEditDistanceDP() {
        assertEquals(3, solution.editDistance("kitten", "sitting"));
        assertEquals(1, solution.editDistance("flaw", "flaws"));
        assertEquals(5, solution.editDistance("intention", "execution"));


        assertEquals(0, solution.editDistance("", ""));
        assertEquals(5, solution.editDistance("", "hello"));
        assertEquals(4, solution.editDistance("test", ""));

        assertEquals(0, solution.editDistance("algorithm", "algorithm"));
        assertEquals(0, solution.editDistance("test", "test"));

        assertEquals(10, solution.editDistance("short", "longerstring"));
        assertEquals(3, solution.editDistance("example", "samples"));

        assertEquals(1, solution.editDistance("Case", "case"));
        assertEquals(3, solution.editDistance("ABC", "abc"));
    }

    @Test
    public void testEditDistanceRecursive() {
        assertEquals(3, solution.editDistanceRecursive("kitten", "sitting"));
        assertEquals(1, solution.editDistanceRecursive("flaw", "flaws"));
        assertEquals(5, solution.editDistanceRecursive("intention", "execution"));


        assertEquals(0, solution.editDistanceRecursive("", ""));
        assertEquals(5, solution.editDistanceRecursive("", "hello"));
        assertEquals(4, solution.editDistanceRecursive("test", ""));

        assertEquals(0, solution.editDistanceRecursive("algorithm", "algorithm"));
        assertEquals(0, solution.editDistanceRecursive("test", "test"));

        assertEquals(10, solution.editDistanceRecursive("short", "longerstring"));
        assertEquals(3, solution.editDistanceRecursive("example", "samples"));

        assertEquals(1, solution.editDistanceRecursive("Case", "case"));
        assertEquals(3, solution.editDistanceRecursive("ABC", "abc"));
    }


    @Test
    public void testEditDistanceMemoization() {
        assertEquals(3, solution.editDistanceMemo("kitten", "sitting"));
        assertEquals(1, solution.editDistanceMemo("flaw", "flaws"));
        assertEquals(5, solution.editDistanceMemo("intention", "execution"));


        assertEquals(0, solution.editDistanceMemo("", ""));
        assertEquals(5, solution.editDistanceMemo("", "hello"));
        assertEquals(4, solution.editDistanceMemo("test", ""));

        assertEquals(0, solution.editDistanceMemo("algorithm", "algorithm"));
        assertEquals(0, solution.editDistanceMemo("test", "test"));

        assertEquals(10, solution.editDistanceMemo("short", "longerstring"));
        assertEquals(3, solution.editDistanceMemo("example", "samples"));

        assertEquals(1, solution.editDistanceMemo("Case", "case"));
        assertEquals(3, solution.editDistanceMemo("ABC", "abc"));
    }
}