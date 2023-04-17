package com.devstromo.day403;

import static com.devstromo.day403.Problem.rand5;
import static com.devstromo.day403.Problem.rand7;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ProblemTest {

    @Test
    public void testRand5() {
        for (int i = 0; i < 10000; i++) {
            int result = rand5();
            assertTrue(result >= 1 && result <= 5, "rand5() should return a number between 1 and 5 (inclusive)");
        }
    }

    @Test
    public void testRand7() {
        for (int i = 0; i < 10000; i++) {
            int result = rand7();
            assertTrue(result >= 1 && result <= 7, "rand7() should return a number between 1 and 7 (inclusive)");
        }
    }
}