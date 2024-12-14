package com.devstromo.easy.p1991;

public class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j) {
                    leftSum += nums[j];
                } else if (i > j) {
                    rightSum += nums[j];
                }
            }
            if (leftSum == rightSum) {
                return i;
            }
            leftSum = 0;
            rightSum = 0;
        }
        return -1;
    }

    public int findMiddleIndexLinear(int[] nums) {
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
