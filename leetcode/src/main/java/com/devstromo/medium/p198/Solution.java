package com.devstromo.medium.p198;

public class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int last = 0;
        int current;
        for (int i = 0; i < nums.length; i++) {
            current = Math.max(prev + nums[i], last);
            prev = last;
            last = current;
        }
        return last;
    }
}
