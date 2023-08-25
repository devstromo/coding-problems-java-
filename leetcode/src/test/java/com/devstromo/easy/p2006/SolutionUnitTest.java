package com.devstromo.easy.p2006;

import static com.devstromo.easy.p2006.Solution.countKDifference;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCountKDifference() {
        assertEquals(4, countKDifference(new int[] { 1, 2, 2, 1 }, 1));
    }

    @Test
    void testCountKDifference2() {
        assertEquals(0, countKDifference(new int[] { 1, 3 }, 3));
    }

    @Test
    void testCountKDifference3() {
        assertEquals(3, countKDifference(new int[] { 3, 2, 1, 5, 4 }, 2));
    }

    @Test
    void testCountKDifference4() {
        assertEquals(6, countKDifference(new int[] { 7, 7, 8, 3, 1, 2, 7, 2, 9, 5 }, 6));
    }
}