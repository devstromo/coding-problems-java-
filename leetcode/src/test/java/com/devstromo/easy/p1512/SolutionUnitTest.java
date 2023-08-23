package com.devstromo.easy.p1512;

import static com.devstromo.easy.p1512.Solution.numIdenticalPairs;
import static com.devstromo.easy.p1512.Solution.numIdenticalPairsArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testNumIdenticalPairs() {
        assertEquals(4, numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }));
    }

    @Test
    void testNumIdenticalPairs2() {
        assertEquals(6, numIdenticalPairs(new int[] { 1, 1, 1, 1 }));
    }

    @Test
    void testNumIdenticalPairs3() {
        assertEquals(0, numIdenticalPairs(new int[] { 1, 2, 3 }));
    }

    @Test
    void testNumIdenticalPairsArray() {
        assertEquals(4, numIdenticalPairsArray(new int[] { 1, 2, 3, 1, 1, 3 }));
    }

    @Test
    void testNumIdenticalPairsArray2() {
        assertEquals(6, numIdenticalPairsArray(new int[] { 1, 1, 1, 1 }));
    }

    @Test
    void testNumIdenticalPairsArray3() {
        assertEquals(0, numIdenticalPairsArray(new int[] { 1, 2, 3 }));
    }
}