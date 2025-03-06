package com.devstromo.medium.p1477;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Find Two Non-overlapping Sub-arrays Each With Target SumLength")
    void findTwoNonOverlappingSubarrays() {
        assertEquals(2, solution.minSumOfLengths(new int[]{3, 2, 2, 4, 3}, 3));
        assertEquals(2, solution.minSumOfLengths(new int[]{7, 3, 4, 7}, 7));
        assertEquals(-1, solution.minSumOfLengths(new int[]{4, 3, 2, 6, 2, 3, 4}, 6));
    }

}