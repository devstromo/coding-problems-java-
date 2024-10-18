package com.devstromo.medium.p152;

public class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(nums[i], nums[i] * currentMax);
            currentMin = Math.min(nums[i], nums[i] * currentMin);

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}
