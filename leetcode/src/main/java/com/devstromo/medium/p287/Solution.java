package com.devstromo.medium.p287;

import java.util.HashSet;

public class Solution {
    public int findDuplicate(int[] nums) {
        final var set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }

    public int findDuplicateBest(int[] nums) {
        int n = nums.length;
        boolean[] pre = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (pre[nums[i]]) return nums[i];
            else pre[nums[i]] = true;
        }
        return -1;
    }
}
