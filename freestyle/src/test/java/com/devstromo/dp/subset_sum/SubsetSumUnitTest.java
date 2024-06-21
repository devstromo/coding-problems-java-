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
    public void testSubsetSumTabular2D() {
        var nums = new int[]{3, 34, 4, 12, 5, 2};
        assertTrue(subsetSum.tabular2D(nums, 9));
        assertFalse(subsetSum.tabular2D(nums, 30));

        var largeNums = new int[]{1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4};
        assertFalse(subsetSum.tabular2D(largeNums, 100));
    }

    @Test
    public void testSubsetSumTabular1D() {
        var nums = new int[]{3, 34, 4, 12, 5, 2};
        assertTrue(subsetSum.tabular1D(nums, 9));
        assertFalse(subsetSum.tabular1D(nums, 30));

        var largeNums = new int[]{1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4};
        assertFalse(subsetSum.tabular1D(largeNums, 100));
    }

    @Test
    public void testSubsetSumTabular2DOptimized() {
        var nums = new int[]{3, 34, 4, 12, 5, 2};
        assertTrue(subsetSum.tabular2DOptimized(nums, 9));
        assertFalse(subsetSum.tabular2DOptimized(nums, 30));

        var largeNums = new int[]{1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4};
        assertFalse(subsetSum.tabular2DOptimized(largeNums, 100));
    }

    @Test
    public void testSubsetSumTabular1DOptimized() {
        var nums = new int[]{3, 34, 4, 12, 5, 2};
        assertTrue(subsetSum.tabular1DOptimized(nums, 9));
        assertFalse(subsetSum.tabular1DOptimized(nums, 30));

        var largeNums = new int[]{1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4};
        assertFalse(subsetSum.tabular1DOptimized(largeNums, 100));
    }


    @Test
    public void testSubsetSumTabular1DOptimizedBoolean() {
        var nums = new int[]{3, 34, 4, 12, 5, 2};
        assertTrue(subsetSum.tabular1DOptimizedBoolean(nums, 9));
        assertFalse(subsetSum.tabular1DOptimizedBoolean(nums, 30));

        var largeNums = new int[]{1, 3, 9, 2, 5, 7, 10, 13, 6, 8, 11, 4};
        assertFalse(subsetSum.tabular1DOptimizedBoolean(largeNums, 100));
    }

}