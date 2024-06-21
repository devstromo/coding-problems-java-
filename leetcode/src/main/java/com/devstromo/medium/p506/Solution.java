package com.devstromo.medium.p506;

import java.util.HashMap;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        final var prefixSumCount = new HashMap<Integer, Integer>();
        prefixSumCount.put(0, 1);

        for (int num : nums) {
            currentSum += num;
            count += prefixSumCount.getOrDefault(currentSum - k,0);
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
