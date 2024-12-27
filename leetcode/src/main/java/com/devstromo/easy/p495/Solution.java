package com.devstromo.easy.p495;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalPoisonedTime = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            totalPoisonedTime += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }

        totalPoisonedTime += duration;

        return totalPoisonedTime;
    }

    public int findPoisonedDurationBest(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int res = 0;
        int start = timeSeries[0];
        int end = start + duration;
        for (int i = 1; i < n; i++) {
            int time = timeSeries[i];
            if (time > end) {
                res += end - start;
                start = time;
            }
            end = time + duration;
        }
        res += end - start;

        return res;
    }
}
