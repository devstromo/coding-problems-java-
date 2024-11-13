package com.devstromo.medium.p525;

import java.util.Arrays;

public class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] prefixSumIndex = new int[2 * n + 1];
        Arrays.fill(prefixSumIndex, -2);
        prefixSumIndex[n] = -1;

        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i] == 0 ? -1 : 1;
            int adjustedIndex = prefixSum + n;
            if (prefixSumIndex[adjustedIndex] >= -1) {
                maxLength = Math.max(maxLength, i - prefixSumIndex[adjustedIndex]);
            } else {
                prefixSumIndex[adjustedIndex] = i;
            }
        }
        return maxLength;
    }
}
