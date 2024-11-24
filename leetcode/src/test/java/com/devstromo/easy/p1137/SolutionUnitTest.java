package com.devstromo.easy.p1137;

import static com.devstromo.easy.p1137.Solution.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCaseTribonacci() {
        assertEquals(4, tribonacci(4));
    }


    @Test
    void testCaseTribonacci2() {
        assertEquals(1389537, tribonacci(25));
    }

    @Test
    void testCaseTribonacciBest() {
        assertEquals(4, tribonacciBest(4));
    }

    @Test
    void testCaseTribonacciBest2() {
        assertEquals(1389537, tribonacciBest(25));
    }

    @Test
    void testCaseTribonacciNoAdditionalSpace() {
        assertEquals(1, tribonacciNoAditional(2));
        assertEquals(4, tribonacciNoAditional(4));
        assertEquals(1389537, tribonacciNoAditional(25));
    }
}