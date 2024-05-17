package com.devstromo.dp.binomial_coefficient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinomialCoefficientUnitTest {
    private final BinomialCoefficient coefficient = new BinomialCoefficient();

    @Test
    public void testBinomialCoefficientRecursive() {
        assertEquals(1, coefficient.binomialCoefficient(4, 0));
        assertEquals(1, coefficient.binomialCoefficient(4, 4));
        assertEquals(6, coefficient.binomialCoefficient(4, 2));
        assertEquals(10, coefficient.binomialCoefficient(5, 2));
    }


}