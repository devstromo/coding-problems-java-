package com.devstromo.dp.maximum_sub_array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArrayUnitTest {
    private final MaximumSubArray solution = new MaximumSubArray();

    @Test
    @DisplayName("Test Maximum Sub Array Sum")
    public void testMaxSubArraySum() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }


}