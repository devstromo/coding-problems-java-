package com.devstromo.easy.p1137;

import static com.devstromo.easy.p1137.Solution.tribonacci;
import static com.devstromo.easy.p1137.Solution.tribonacciBest;
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
}