package com.devstromo.medium.p1937;

public class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;

        long[] prev = new long[n];
        for (int j = 0; j < n; j++) {
            prev[j] = points[0][j];
        }

        for (int i = 1; i < m; i++) {
            long[] left = new long[n];
            long[] right = new long[n];
            long[] curr = new long[n];

            // Left to right
            left[0] = prev[0];
            for (int j = 1; j < n; j++) {
                left[j] = Math.max(left[j - 1] - 1, prev[j]);
            }

            // Right to left
            right[n - 1] = prev[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                right[j] = Math.max(right[j + 1] - 1, prev[j]);
            }

            // Choose the best from left or right
            for (int j = 0; j < n; j++) {
                curr[j] = points[i][j] + Math.max(left[j], right[j]);
            }

            prev = curr;
        }

        long max = 0;
        for (long val : prev) {
            max = Math.max(max, val);
        }

        return max;
    }

    public long maxPointsBest(int[][] points) {
        int n = points.length;
        int m = points[0].length;
        long[] maxScore = new long[m];

        for (int i = 0; i < m; i++) {
            maxScore[i] = points[0][i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                maxScore[j] = Math.max(maxScore[j], maxScore[j - 1] - 1);
            }

            long right = maxScore[m - 1];
            maxScore[m - 1] += points[i][m - 1];

            for (int k = m - 2; k >= 0; k--) {
                right = Math.max(right - 1, maxScore[k]);
                maxScore[k] = points[i][k] + right;
            }
        }

        long res = 0;
        for (long score : maxScore) {
            res = Math.max(res, score);
        }

        return res;
    }
}
