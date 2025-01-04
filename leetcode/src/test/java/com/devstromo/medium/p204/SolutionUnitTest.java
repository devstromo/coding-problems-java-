package com.devstromo.medium.p204;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test count primes")
    void testCountPrimes() {
        assertEquals(0, solution.countPrimes(0));
        assertEquals(0, solution.countPrimes(1));
        assertEquals(0, solution.countPrimes(2));
        assertEquals(1, solution.countPrimes(3));
        assertEquals(4, solution.countPrimes(10));
    }
}