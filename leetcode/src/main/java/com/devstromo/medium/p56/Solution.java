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

    public int[][] mergeBest(int[][] intervals) {
        // Sweepline algorithm
        int max = 0;
        for (int i = 0; i < intervals.length; i++) {
            max = Math.max(intervals[i][0], max);
        }
        int[] mp = new int[max + 1];
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            mp[start] = Math.max(end + 1, mp[start]);
        }
        int r = 0;
        int initialStart = -1;
        int have = -1;
        for (int i = 0; i < mp.length; i++) {
            if (mp[i] != 0) {
                if (initialStart == -1)
                    initialStart = i;
                have = Math.max(mp[i] - 1, have);
            }
            if (have == i) {
                intervals[r++] = new int[] { initialStart, have };
                initialStart = -1;
                have = -1;
            }
        }
        if (initialStart != -1) {
            intervals[r++] = new int[] { initialStart, have };
        }
        if (intervals.length == r) {
            return intervals;
        }
        int[][] res = new int[r][];
        for (int i = 0; i < r; i++) {
            res[i] = intervals[i];
        }
        return res;
    }
}
