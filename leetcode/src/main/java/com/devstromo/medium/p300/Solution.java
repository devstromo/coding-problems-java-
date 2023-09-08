package com.devstromo.medium.p300;

class Solution {
    public static int lengthOfLIS(int[] nums) {
        var n = nums.length;
        var lis = new int[n];
        var i = 0;
        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }
        for (i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
            }
        }
        var max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            if (lis[i] > max) {
                max = lis[i];
            }
        }
        return max;
    }

    public static int lengthOfLISBestMemory(int[] nums) {
        var n = nums.length;
        var lis = new int[n];
        var i = 0;
        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }
        for (i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        var max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            max = Math.max(lis[i], max);
        }
        return max;
    }
}
