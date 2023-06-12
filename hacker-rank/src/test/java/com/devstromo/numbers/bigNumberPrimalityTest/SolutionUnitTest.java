package com.devstromo.numbers.bigNumberPrimalityTest;

import static com.devstromo.numbers.bigNumberPrimalityTest.Solution.isPrime;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testIsPrime() {
        assertTrue(isPrime("3"));
        assertTrue(isPrime("5"));
        assertTrue(isPrime("11"));
        assertTrue(isPrime("13"));
        assertTrue(isPrime("81938106874021281413"));
    }

    @Test
    void testIsNotPrime() {
        assertFalse(isPrime("4"));
        assertFalse(isPrime("8"));
        assertFalse(isPrime("49"));
        assertFalse(isPrime("100"));
        assertFalse(isPrime("225"));
    }

}