package com.devstromo.medium.p1140;

import static com.devstromo.medium.p1140.Solution.stoneGameII;
import static com.devstromo.medium.p1140.Solution.stoneGameIIBestRuntime;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testStoneGameII() {
        assertEquals(10, stoneGameII(new int[] { 2, 7, 9, 4, 4 }));
    }

    @Test
    void testStoneGameII2() {
        assertEquals(104, stoneGameII(new int[] { 1, 2, 3, 4, 5, 100 }));
    }

    @Test
    void testStoneGameIIBestRuntime() {
        assertEquals(10, stoneGameIIBestRuntime(new int[] { 2, 7, 9, 4, 4 }));
    }

    @Test
    void testStoneGameIIBestRuntime2() {
        assertEquals(104, stoneGameIIBestRuntime(new int[] { 1, 2, 3, 4, 5, 100 }));
    }
}