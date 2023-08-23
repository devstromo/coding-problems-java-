package com.devstromo.easy.p2367;

public class Solution {
    public static int arithmeticTriplets(int[] nums, int diff) {
        var count = 0;
        for (var i = 0; i < nums.length - 2; i++) {
            for (var j = i + 1; j < nums.length - 1; j++) {
                for (var k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff)
                        count++;
                }
            }

        }
        return count;
    }

    public static int arithmeticTripletsBest(int[] nums, int diff) {
        var result = 0;
        var count = new boolean[201];
        for (var num : nums) {
            if (num >= 2 * diff && count[num - diff] && count[num - 2 * diff])
                result++;
            count[num] = true;
        }
        return result;
    }
}
