package com.devstromo.easy.p674;

class Solution {
    public static int findLengthOfLCIS(int[] nums) {
        var n = nums.length;
        var i = 0;
        var lis = new int[n];
        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }

        for (i = 1; i < n; i++) {
            for (var j = 0; j < i; j++) {
                if (j == i - 1 && nums[i] > nums[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        var max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            max = Math.max(max, lis[i]);
        }
        return max;
    }

    public static int findLengthOfLCISBest(int[] nums) {
        var maxLength = 1;
        var currentLength = 1;
        for (var i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }
        return maxLength;
    }
}
