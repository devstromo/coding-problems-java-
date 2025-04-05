package com.devstromo.dp.maximum_sub_array;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int maxLocal = max;

        for (int i = 1; i < n; i++) {
            maxLocal = Math.max(nums[i], nums[i] + maxLocal);
            if (maxLocal > max) {
                max = maxLocal;
            }
        }

        return max;
    }
}
