package com.devstromo.easy.p2652;

import static com.devstromo.easy.p2652.Solution.sumOfMultiples;
import static com.devstromo.easy.p2652.Solution.sumOfMultiplesBest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testSumOfMultiples() {
        assertEquals(21, sumOfMultiples(7));
    }

    @Test
    void testSumOfMultiples2() {
        assertEquals(40, sumOfMultiples(10));
    }

    @Test
    void testSumOfMultiples3() {
        assertEquals(30, sumOfMultiples(9));
    }

    @Test
    void testSumOfMultiplesBest() {
        assertEquals(21, sumOfMultiplesBest(7));
    }

    @Test
    void testSumOfMultiplesBest2() {
        assertEquals(40, sumOfMultiplesBest(10));
    }

    @Test
    void testSumOfMultiplesBest3() {
        assertEquals(30, sumOfMultiplesBest(9));
    }
}