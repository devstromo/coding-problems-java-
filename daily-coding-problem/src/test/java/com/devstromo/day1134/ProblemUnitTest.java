package com.devstromo.day1134;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemUnitTest {
    private final Problem problem = new Problem();

    @Test
    @DisplayName("Test stream median")
    void testStreamMedian() {
        int[] stream      = {2, 1, 5, 7, 2, 0, 5};
        double[] expected = {2, 1.5, 2, 3.5, 2, 2, 2};
        for (int i = 0; i < stream.length; i++) {
            double actual = problem.add(stream[i]);
            assertEquals(expected[i], actual, 1e-9,
                    "Mismatch at index " + i);
        }
    }


}