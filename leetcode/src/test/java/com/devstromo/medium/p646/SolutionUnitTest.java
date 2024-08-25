package com.devstromo.medium.p646;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    private final Solution solution = new Solution();

    @Test
    void testFindLongestChain() {
        final var nums = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4}
        };
        assertEquals(2, solution.findLongestChain(nums));

        final var nums2 = new int[][]{
                {1, 2},
                {7, 8},
                {4, 5}
        };
        assertEquals(3, solution.findLongestChain(nums2));
    }

    @Test
    void testFindLongestChainBest() {
        final var nums = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4}
        };
        assertEquals(2, solution.findLongestChainBest(nums));

        final var nums2 = new int[][]{
                {1, 2},
                {7, 8},
                {4, 5}
        };
        assertEquals(3, solution.findLongestChainBest(nums2));
    }

}