package com.devstromo.day849;

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
            "27, 111"
    })
    public void testSolve(long input, long expected) {
        final var result = problem.solve(input);
        assertEquals(expected, result, "Expected " + expected + " iterations for input " + input);
    }

}