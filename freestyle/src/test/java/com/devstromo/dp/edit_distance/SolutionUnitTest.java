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

    @Test
    public void testEditDistanceSpaceOptimized() {
        assertEquals(3, solution.editDistanceSpaceOptimized("kitten", "sitting"));
        assertEquals(1, solution.editDistanceSpaceOptimized("flaw", "flaws"));
        assertEquals(5, solution.editDistanceSpaceOptimized("intention", "execution"));


        assertEquals(0, solution.editDistanceSpaceOptimized("", ""));
        assertEquals(5, solution.editDistanceSpaceOptimized("", "hello"));
        assertEquals(4, solution.editDistanceSpaceOptimized("test", ""));

        assertEquals(0, solution.editDistanceSpaceOptimized("algorithm", "algorithm"));
        assertEquals(0, solution.editDistanceSpaceOptimized("test", "test"));

        assertEquals(10, solution.editDistanceSpaceOptimized("short", "longerstring"));
        assertEquals(3, solution.editDistanceSpaceOptimized("example", "samples"));

        assertEquals(1, solution.editDistanceSpaceOptimized("Case", "case"));
        assertEquals(3, solution.editDistanceSpaceOptimized("ABC", "abc"));
    }


    @Test
    public void testEditDistanceSpaceOptimizedSecond() {
        assertEquals(3, solution.editDistanceSpaceOptimizedSecond("kitten", "sitting"));
        assertEquals(1, solution.editDistanceSpaceOptimizedSecond("flaw", "flaws"));
        assertEquals(5, solution.editDistanceSpaceOptimizedSecond("intention", "execution"));


        assertEquals(0, solution.editDistanceSpaceOptimizedSecond("", ""));
        assertEquals(5, solution.editDistanceSpaceOptimizedSecond("", "hello"));
        assertEquals(4, solution.editDistanceSpaceOptimizedSecond("test", ""));

        assertEquals(0, solution.editDistanceSpaceOptimizedSecond("algorithm", "algorithm"));
        assertEquals(0, solution.editDistanceSpaceOptimizedSecond("test", "test"));

        assertEquals(10, solution.editDistanceSpaceOptimizedSecond("short", "longerstring"));
        assertEquals(3, solution.editDistanceSpaceOptimizedSecond("example", "samples"));

        assertEquals(1, solution.editDistanceSpaceOptimizedSecond("Case", "case"));
        assertEquals(3, solution.editDistanceSpaceOptimizedSecond("ABC", "abc"));
    }
}