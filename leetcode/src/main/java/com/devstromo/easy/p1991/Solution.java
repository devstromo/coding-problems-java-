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
}
