package com.devstromo.medium.p57;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        if (n == 0) return new int[][]{newInterval};
        int[][] newIntervals = new int[n + 1][intervals[0].length];
        for (int i = 0; i < n; i++) {
            System.arraycopy(intervals[i], 0, newIntervals[i], 0, intervals[0].length);
        }
        newIntervals[n] = newInterval;

        int max = 0;
        for (int[] interval : newIntervals) {
            max = Math.max(interval[0], max);
        }
        int[] maximum = new int[max + 1];
        for (int[] interval : newIntervals) {
            int start = interval[0];
            int end = interval[1];
            maximum[start] = Math.max(end + 1, maximum[start]);
        }
        int range = 0;
        int initialStart = -1;
        int end = -1;
        for (int i = 0; i < maximum.length; i++) {
            if (maximum[i] != 0) {
                if (initialStart == -1) initialStart = i;
                end = Math.max(maximum[i] - 1, end);
            }
            if (end == i) {
                newIntervals[range++] = new int[]{initialStart, end};
                initialStart = -1;
                end = -1;
            }
        }
        if (initialStart != -1) {
            newIntervals[range++] = new int[]{initialStart, end};
        }
        if (newIntervals.length == range) {
            return newIntervals;
        }
        int[][] result = new int[range][];
        System.arraycopy(newIntervals, 0, result, 0, range);
        return result;
    }

    public int[][] insertBest(int[][] intervals, int[] pair) {
        int n = intervals.length;
        List<int[]> newIntervals = new ArrayList<>();
        int i = 0;
        while (i < n && intervals[i][1] < pair[0]) {
            newIntervals.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= pair[1]) {
            pair[0] = Math.min(pair[0], intervals[i][0]);
            pair[1] = Math.max(pair[1], intervals[i][1]);
            i++;
        }
        newIntervals.add(pair);

        while (i < n) {
            newIntervals.add(intervals[i]);
            i++;
        }

        int[][] response = new int[newIntervals.size()][2];
        i = 0;
        while (i < response.length) {
            response[i] = newIntervals.get(i);
            i++;
        }
        return response;

    }
}
