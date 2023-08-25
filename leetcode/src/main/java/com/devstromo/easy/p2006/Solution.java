package com.devstromo.easy.p2006;

class Solution {
    public static int countKDifference(int[] nums, int k) {
        var result = 0;
        var count = new int[101];
        for (var num : nums) {
            if (num > k)
                result += count[num - k];
            if (num + k < 101) {
                result += count[num + k];
            }
            count[num]++;
        }
        return result;
    }
}
