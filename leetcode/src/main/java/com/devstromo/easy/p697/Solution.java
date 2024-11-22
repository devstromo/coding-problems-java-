package com.devstromo.easy.p697;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            first.putIfAbsent(num, i);
            last.put(num, i);
        }

        int degree = Collections.max(freq.values());

        int minLength = Integer.MAX_VALUE;
        for (int num : freq.keySet()) {
            if (freq.get(num) == degree) {
                int length = last.get(num) - first.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }
}
