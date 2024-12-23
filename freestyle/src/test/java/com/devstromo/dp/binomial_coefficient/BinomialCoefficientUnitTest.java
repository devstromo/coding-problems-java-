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
        assertEquals(1420494075, coefficient.binomialCoefficient(56, 8));
    }

    @Test
    public void testBinomialCoefficientWith2DArray() {
        assertEquals(1, coefficient.binomialCoefficientWith2dMatrix(4, 0));
        assertEquals(1, coefficient.binomialCoefficientWith2dMatrix(4, 4));
        assertEquals(6, coefficient.binomialCoefficientWith2dMatrix(4, 2));
        assertEquals(10, coefficient.binomialCoefficientWith2dMatrix(5, 2));
        assertEquals(1420494075, coefficient.binomialCoefficientWith2dMatrix(56, 8));
    }

    @Test
    public void testBinomialCoefficientWith1DArray() {
        assertEquals(1, coefficient.binomialCoefficientWith1dArray(4, 0));
        assertEquals(1, coefficient.binomialCoefficientWith1dArray(4, 4));
        assertEquals(6, coefficient.binomialCoefficientWith1dArray(4, 2));
        assertEquals(10, coefficient.binomialCoefficientWith1dArray(5, 2));
        assertEquals(1420494075, coefficient.binomialCoefficientWith1dArray(56, 8));
    }


}