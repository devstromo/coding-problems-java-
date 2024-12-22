package com.devstromo.medium.p435;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int removals = 0;
        int prevEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevEnd) {
                removals++;
            } else {
                prevEnd = intervals[i][1];
            }
        }

        return removals;
    }
}
