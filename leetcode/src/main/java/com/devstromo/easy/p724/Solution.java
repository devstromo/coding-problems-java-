package com.devstromo.easy.p724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }

        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];

        sumLeft[0] = 0;
        for (int i = 1; i < n; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i - 1];
        }

        sumRight[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }

        return -1;
    }

    public int pivotIndexNoAdditionalSpace(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

}
