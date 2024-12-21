package com.devstromo.medium.p56;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int[][] merged = new int[intervals.length][2];
        int index = 0;

        for (int[] interval : intervals) {
            if (index == 0 || merged[index - 1][1] < interval[0]) {
                merged[index++] = interval;
            } else {
                merged[index - 1][1] = Math.max(merged[index - 1][1], interval[1]);
            }
        }

        return Arrays.copyOf(merged, index);
    }
}
