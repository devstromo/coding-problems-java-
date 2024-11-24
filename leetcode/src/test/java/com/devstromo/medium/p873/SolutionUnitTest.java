package com.devstromo.medium.p873;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    public void testLenLongestFibSubseq() {
        assertEquals(5, solution.lenLongestFibSubseq(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(3, solution.lenLongestFibSubseq(new int[]{1, 3, 7, 11, 12, 14, 18}));
    }

    @Test
    public void testLenLongestFibSubseqBest() {
        assertEquals(5, solution.lenLongestFibSubseqBest(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(3, solution.lenLongestFibSubseqBest(new int[]{1, 3, 7, 11, 12, 14, 18}));
    }

}