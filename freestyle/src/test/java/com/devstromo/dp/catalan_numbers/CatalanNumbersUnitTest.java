package com.devstromo.dp.catalan_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatalanNumbersUnitTest {
    private CatalanNumbers catalanNumbers = new CatalanNumbers();
    ;

    @Test
    public void testCatalanNumberZero() {
        assertEquals(1, catalanNumbers.catalanNumber(0), "The 0th Catalan number should be 1");
    }

    @Test
    public void testCatalanNumberOne() {
        assertEquals(1, catalanNumbers.catalanNumber(1), "The 1st Catalan number should be 1");
    }

    @Test
    public void testCatalanNumberTwo() {
        assertEquals(2, catalanNumbers.catalanNumber(2), "The 2nd Catalan number should be 2");
    }

    @Test
    public void testCatalanNumberThree() {
        assertEquals(5, catalanNumbers.catalanNumber(3), "The 3rd Catalan number should be 5");
    }

    @Test
    public void testCatalanNumberFour() {
        assertEquals(14, catalanNumbers.catalanNumber(4), "The 4th Catalan number should be 14");
    }

    @Test
    public void testCatalanNumberFive() {
        assertEquals(42, catalanNumbers.catalanNumber(5), "The 5th Catalan number should be 42");
    }

    @Test
    public void testCatalanNumberLarge() {
        assertEquals(132, catalanNumbers.catalanNumber(6), "The 6th Catalan number should be 132");
    }

    @Test
    public void testCatalanNumberVeryLarge() {
        assertEquals(16796, catalanNumbers.catalanNumber(10), "The 10th Catalan number should be 16796");
    }


    @Test
    public void testCatalanNumberWithBinomialCoefficientZero() {
        assertEquals(1, catalanNumbers.catalanNumber(0), "The 0th Catalan number should be 1");
    }

    @Test
    public void testCatalanNumberWithBinomialCoefficientOne() {
        assertEquals(1, catalanNumbers.catalanNumberWithBinomialCoefficient(1), "The 1st Catalan number should be 1");
    }

    @Test
    public void testCatalanNumberWithBinomialCoefficientTwo() {
        assertEquals(2, catalanNumbers.catalanNumberWithBinomialCoefficient(2), "The 2nd Catalan number should be 2");
    }

    @Test
    public void testCatalanNumberWithBinomialCoefficientThree() {
        assertEquals(5, catalanNumbers.catalanNumberWithBinomialCoefficient(3), "The 3rd Catalan number should be 5");
    }

    @Test
    public void testCatalanNumberWithBinomialCoefficientFour() {
        assertEquals(14, catalanNumbers.catalanNumberWithBinomialCoefficient(4), "The 4th Catalan number should be 14");
    }

    @Test
    public void testCatalanNumberWithBinomialCoefficientFive() {
        assertEquals(42, catalanNumbers.catalanNumberWithBinomialCoefficient(5), "The 5th Catalan number should be 42");
    }

    @Test
    public void testCatalanNumberWithBinomialCoefficientLarge() {
        assertEquals(132, catalanNumbers.catalanNumberWithBinomialCoefficient(6), "The 6th Catalan number should be 132");
    }

    @Test
    public void testCatalanNumberWithBinomialCoefficientVeryLarge() {
        assertEquals(16796, catalanNumbers.catalanNumberWithBinomialCoefficient(10), "The 10th Catalan number should be 16796");
    }

}