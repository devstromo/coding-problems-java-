package com.devstromo.day849;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ProblemUnitTest {

    private final Problem problem = new Problem();

    @ParameterizedTest
    @CsvSource({
            "8, 3",
            "3, 7",
            "1, 0",
            "27, 111",
            "199, 119",
            "837799, 524"
    })
    public void testSolve(long input, long expected) {
        final var result = problem.solve(input);
        assertEquals(expected, result, "Expected " + expected + " iterations for input " + input);
    }

    @ParameterizedTest
    @CsvSource({
            "8, 3",
            "3, 7",
            "1, 0",
            "27, 111",
            "199, 119",
            "837799, 524"
    })
    public void testSolveRecursive(long input, long expected) {
        final var result = problem.solveRecursive(input);
        assertEquals(expected, result, "Expected " + expected + " iterations for input " + input);
    }

    @ParameterizedTest
    @CsvSource({
            "8, 3",
            "3, 7",
            "1, 0",
            "27, 111",
            "199, 119",
            "837799, 524"
    })
    public void testSolveRecursiveMemo(long input, long expected) {
        final var result = problem.solveRecursiveMemo(input);
        assertEquals(expected, result, "Expected " + expected + " iterations for input " + input);
    }

    @Test
    public void testMaxSequenceLessThan1_000_000() {
        final var result = problem.longestSequences();
        assertFalse(result.isEmpty());
        final var firstKey = result.keySet().stream().findFirst();
        var key = firstKey.get();
        assertEquals(837799, key);
        assertEquals(524, result.get(key));
    }

    @Test
    public void testMaxSequenceLessThan1_000_000WithCache() {
        final var result = problem.longestSequencesWithCache();
        assertFalse(result.isEmpty());
        final var firstKey = result.keySet().stream().findFirst();
        var key = firstKey.get();
        assertEquals(837799, key);
        assertEquals(524, result.get(key) - 1);
    }

}