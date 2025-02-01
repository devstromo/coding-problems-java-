package com.devstromo.medium.p698;

import java.util.Arrays;

public class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();

        if (sum % k != 0) return false;

        int target = sum / k;
        Arrays.sort(nums);
        int n = nums.length;
        boolean[] used = new boolean[n];

        return backtrack(nums, used, k, 0, 0, target);
    }

    private boolean backtrack(int[] nums, boolean[] used, int k, int startIdx, int currSum, int target) {
        if (k == 0) return true; // All k subsets are found
        if (currSum == target) return backtrack(nums, used, k - 1, 0, 0, target); // Find next subset

        for (int i = startIdx; i < nums.length; i++) {
            if (used[i] || currSum + nums[i] > target) continue;

            // Choose
            used[i] = true;

            // Explore
            if (backtrack(nums, used, k, i + 1, currSum + nums[i], target)) return true;

            // Unchoose
            used[i] = false;

            // Prune: If first number in subset fails, no need to try others
            if (currSum == 0) return false;
        }
        return false;
    }
}
