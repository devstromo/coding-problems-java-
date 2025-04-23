package com.devstromo.day1110;

import java.util.Arrays;

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

    public boolean solveTwoPointers(int[] nums) {
        int n = nums.length;

        boolean allZero = Arrays.stream(nums).allMatch(x -> x == 0);
        if (allZero) return false;

        int[] squared = Arrays.stream(nums)
                .map(x -> x * x)
                .toArray();

        Arrays.sort(squared);

        for (int i = n - 1; i >= 2; i--) {
            if (squared[i] == 0) continue;
            int left = 0;
            int right = i - 1;

            while (left < right) {
                int sum = squared[left] + squared[right];

                if (sum == squared[i]) {
                    if (squared[left] != 0 || squared[right] != 0) return true;
                    left++;
                    right--;
                } else if (sum < squared[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }

}
