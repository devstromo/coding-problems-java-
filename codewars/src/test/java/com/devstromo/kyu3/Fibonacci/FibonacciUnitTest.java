package com.devstromo.kyu3.Fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class FibonacciUnitTest {

    @Test
    public void testFib0() {
        testFib(0, 0);
    }

    @Test
    public void testFib1() {
        testFib(1, 1);
    }

    @Test
    public void testFib2() {
        testFib(1, 2);
    }

    @Test
    public void testFib3() {
        testFib(2, 3);
    }

    @Test
    public void testFib4() {
        testFib(3, 4);
    }

    @Test
    public void testFib5() {
        testFib(5, 5);
    }

    @Test
    public void testFib6() {
        testFib(-8, -6);
    }

    @Test
    public void testFib7() {
        testFib(2111485077978050L, -75);
    }

    @Test
    public void testFib8() {
        testFib(17167680177565L, -65);
    }

    @Test
    public void testFib9() {
        testFib(1, -1);
    }

    @Test
    public void testFib10() {
        testFib(6557470319842L, -63);
    }

    private static void testFib(long expected, long input) {
        BigInteger found;
        try {
            found = Fibonacci.fib(BigInteger.valueOf(input));
        } catch (Throwable e) {
            // see https://github.com/Codewars/codewars.com/issues/21
            throw new AssertionError("exception during test: " + e, e);
        }
        assertEquals(BigInteger.valueOf(expected), found);
    }

}