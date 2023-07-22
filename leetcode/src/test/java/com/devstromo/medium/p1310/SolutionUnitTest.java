package com.devstromo.medium.p1310;

import static com.devstromo.medium.p1310.Solution.xorQueries;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testXorQueries() {
        assertArrayEquals(new int[] { 2, 7, 14, 8 }, xorQueries(new int[] { 1, 3, 4, 8 }, new int[][] { { 0, 1 }, { 1, 2 }, { 0, 3 }, { 3, 3 } }));
    }

    @Test
    void testXorQueries2() {
        assertArrayEquals(new int[] { 8, 0, 4, 4 }, xorQueries(new int[] { 4, 8, 2, 10 }, new int[][] { { 2, 3 }, { 1, 3 }, { 0, 0 }, { 0, 3 } }));
    }

}