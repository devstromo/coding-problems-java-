package com.devstromo.medium.p2466;

import static com.devstromo.medium.p2466.Solution.countGoodStrings;
import static com.devstromo.medium.p2466.Solution.countGoodStrings1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCountGoodStrings() {
        assertEquals(8, countGoodStrings(3, 3, 1, 1));
    }

    @Test
    void testCountGoodStrings2() {
        assertEquals(5, countGoodStrings(2, 3, 1, 2));
    }

    @Test
    void testCountGoodStrings3() {
        assertEquals(8, countGoodStrings1(3, 3, 1, 1));
    }

    @Test
    void testCountGoodStrings4() {
        assertEquals(5, countGoodStrings1(2, 3, 1, 2));
    }
}