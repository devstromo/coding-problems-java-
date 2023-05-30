package com.devstromo.easy.p1365;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testSmallerNumbersThanCurrent() {
        assertArrayEquals(new int[] { 4, 0, 1, 1, 3 }, Solution.smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 }));
        assertArrayEquals(new int[] { 2, 1, 0, 3 }, Solution.smallerNumbersThanCurrent(new int[] { 6, 5, 4, 8 }));
        assertArrayEquals(new int[] { 0, 0, 0, 0 }, Solution.smallerNumbersThanCurrent(new int[] { 7, 7, 7, 7 }));
    }

}