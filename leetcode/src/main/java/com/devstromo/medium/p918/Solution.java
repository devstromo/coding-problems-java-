package com.devstromo.medium.p918;

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentMax = 0;
        int currentMin = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int totalSum = 0;

        for (int num: nums) {
            currentMax = Math.max(currentMax, 0) + num;
            maxSum = Math.max(maxSum, currentMax);
            currentMin = Math.min(currentMin, 0) + num;
            minSum = Math.min(minSum, currentMin);
            totalSum += num;
        }

        if (totalSum == minSum) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}
