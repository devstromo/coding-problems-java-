package com.devstromo.easy.p121;

import static com.devstromo.easy.p121.Solution.maxProfit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMaxProfit() {
        assertEquals(5, maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }

    @Test
    void testMaxProfit2() {
        assertEquals(0, maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}