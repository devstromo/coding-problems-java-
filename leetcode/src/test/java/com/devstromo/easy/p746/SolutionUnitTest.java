package com.devstromo.easy.p746;

import static com.devstromo.easy.p746.Solution.minCostClimbingStairs;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMinCostClimbingStairs() {
        assertEquals(15, minCostClimbingStairs(new int[] { 10, 15, 20 }));
    }

    @Test
    void testMinCostClimbingStairs1() {
        assertEquals(6, minCostClimbingStairs(new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 }));
    }

}