package com.devstromo.dynamic_programming.fibonacci_modified;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultUnitTest {

    @Test
    void testFibonacciModified() {
        assertEquals(new BigInteger("27"), Result.fibonacciModified(0, 1, 6));
    }

    @Test
    void testFibonacciModified2() {
        assertEquals(new BigInteger("5"), Result.fibonacciModified(0, 1, 5));
    }

    @Test
    void testFibonacciModified3() {
        assertEquals(new BigInteger("84266613096281243382112"), Result.fibonacciModified(0, 1, 10));
    }
}