package com.devstromo.medium.p1749;

public class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0;
        int min = 0;
        int maxSum = 0;
        int minSum = 0;

        for (int num : nums) {
            maxSum = Math.max(maxSum + num, num);
            max = Math.max(max, maxSum);

            minSum = Math.min(minSum + num, num);
            min = Math.min(min, minSum);
        }

        return Math.max(max, Math.abs(min));
    }

    public int maxAbsoluteSumBest(int[] nums) {
        int max = 0;
        int min = 0;
        int sum = 0;
        for (int num : nums) {
            if (sum < 0) {
                sum = 0;
            }
            sum += num;
            if (sum > max) {
                max = sum;
            }

        }
        sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum = 0;
            }
            sum += num;
            if (sum < min) {
                min = sum;
            }
        }

        return Math.max(max, Math.abs(min));
    }
}
