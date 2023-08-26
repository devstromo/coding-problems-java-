package com.devstromo.easy.p2413;

import static com.devstromo.easy.p2413.Solution.smallestEvenMultiple;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testSmallestEvenMultiple() {
        assertEquals(10, smallestEvenMultiple(5));
    }

    @Test
    void testSmallestEvenMultiple2() {
        assertEquals(6, smallestEvenMultiple(6));
    }

}