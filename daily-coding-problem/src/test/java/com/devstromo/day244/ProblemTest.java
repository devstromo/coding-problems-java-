package com.devstromo.day244;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ProblemTest {

    private final Problem sieve = new Problem();

    @Test
    public void testSieve() {
        assertArrayEquals(new int[] { 2, 3 }, sieve.solve(4));
        assertArrayEquals(new int[] { 2, 3, 5, 7, 11, 13, 17, 19 }, sieve.solve(20));
        assertArrayEquals(new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 }, sieve.solve(100));
    }

}