package com.devstromo.easy.p2395;

import java.util.HashSet;

public class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        if (n < 2) return false;
        final var set = new HashSet<Integer>();
        for (int i = 1; i < n; i++) {
            if (set.contains(nums[i] + nums[i - 1])) return true;
            set.add(nums[i] + nums[i - 1]);
        }
        return false;
    }
}
