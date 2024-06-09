package com.devstromo.dp.subset_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsetSumUnitTest {
    private final SubsetSum subsetSum = new SubsetSum();

    @Test
    public void testSubsetSumRecursive() {
        var nums = new int[]{3, 34, 4, 12, 5, 2};
        assertTrue(subsetSum.recursive(nums, 9));
        assertFalse(subsetSum.recursive(nums, 30));

        var largeNums = new int[]{1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4};
        assertFalse(subsetSum.recursive(largeNums, 100));
    }

    @Test
    public void testSubsetSumTabularMemoizationRecursive() {
        var nums = new int[]{3, 34, 4, 12, 5, 2};
        assertTrue(subsetSum.memoizationRecursive(nums, 9));
        assertFalse(subsetSum.memoizationRecursive(nums, 30));

        var largeNums = new int[]{1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4};
        assertFalse(subsetSum.memoizationRecursive(largeNums, 100));
    }

    @Test
    public void testSubsetSumTabularMemoization() {
        var nums = new int[]{3, 34, 4, 12, 5, 2};
        assertTrue(subsetSum.memoization(nums, 9));
        assertFalse(subsetSum.memoization(nums, 30));

        var largeNums = new int[]{1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4};
        assertFalse(subsetSum.memoization(largeNums, 100));
    }

}