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
    }

}