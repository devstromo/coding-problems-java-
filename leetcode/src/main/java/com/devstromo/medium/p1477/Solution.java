package com.devstromo.medium.p1477;

import java.util.Arrays;

public class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE); // Stores min length of subarray ending at index i

        int minLen = Integer.MAX_VALUE;
        int leftMin = Integer.MAX_VALUE; // Best length of first subarray found so far
        int left = 0, sum = 0;

        // Step 1: Sliding window to find subarrays with sum = target
        for (int right = 0; right < n; right++) {
            sum += arr[right];

            // Shrink window from left if sum exceeds target
            while (sum > target) {
                sum -= arr[left++];
            }

            // If we find a valid subarray
            if (sum == target) {
                int curLen = right - left + 1;
                if (left > 0 && dp[left - 1] != Integer.MAX_VALUE) {
                    minLen = Math.min(minLen, curLen + dp[left - 1]); // Min sum of lengths
                }
                leftMin = Math.min(leftMin, curLen); // Update best left subarray
            }

            dp[right] = leftMin; // Store min length up to index right
        }

        return (minLen == Integer.MAX_VALUE) ? -1 : minLen;
    }
}
