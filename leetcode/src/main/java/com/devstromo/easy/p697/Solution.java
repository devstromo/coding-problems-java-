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


    public int findShortestSubArrayBest(int[] nums) {

        int max = -1;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max) max = nums[i];

        MinMax[] minmax = new MinMax[max + 1];
        int maxfreq = 0;
        for (int i = 0; i < nums.length; i++) {
            if (minmax[nums[i]] == null)
                minmax[nums[i]] = new MinMax(i);
            minmax[nums[i]].max = i;
            minmax[nums[i]].count++;

            if (minmax[nums[i]].count > maxfreq)
                maxfreq = minmax[nums[i]].count;
        }
        int minarray = Integer.MAX_VALUE;
        for (int i = 0; i < minmax.length; i++) {
            if (minmax[i] != null && minmax[i].count == maxfreq)
                minarray = Math.min(minarray, minmax[i].max - minmax[i].min + 1);
        }
        return minarray;
    }

    private static class MinMax {
        int count = 0;
        int min;
        int max;

        public MinMax(int i) {
            min = i;
            max = i;
        }
    }
}
