package com.devstromo.easy.p1512;

class Solution {
    public static int numIdenticalPairs(int[] nums) {
        var count = 0;
        for (var i = 0; i < nums.length - 1; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

    public static int numIdenticalPairsArray(int[] nums) {
        var count = new int[101];
        var result = 0;
        for (var num : nums) {
            result += count[num]++;
        }
        return result;
    }
}
