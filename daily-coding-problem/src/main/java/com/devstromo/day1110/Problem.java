package com.devstromo.day1110;

public class Problem {
    public boolean solve(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 0) continue;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] == 0) continue;
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] == 0) continue;
                    if (nums[i] * nums[i] + nums[j] * nums[j] == nums[k] * nums[k]) {
                        return true;
                    }
                    if (nums[i] * nums[i] + nums[k] * nums[k] == nums[j] * nums[j]) {
                        return true;
                    }
                    if (nums[k] * nums[k] + nums[j] * nums[j] == nums[i] * nums[i]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
