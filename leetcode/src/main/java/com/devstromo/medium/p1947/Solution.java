package com.devstromo.medium.p1947;

public class Solution {
    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        int m = students.length;
        int n = students[0].length;

        // Precompute compatibility scores
        int[][] score = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int match = 0;
                for (int k = 0; k < n; k++) {
                    if (students[i][k] == mentors[j][k]) {
                        match++;
                    }
                }
                score[i][j] = match;
            }
        }

        // dp[mask]: max score with mentors assigned as in mask
        int[] dp = new int[1 << m];

        for (int mask = 0; mask < (1 << m); mask++) {
            int studentIndex = Integer.bitCount(mask); // how many students have been assigned
            if (studentIndex >= m) continue;

            for (int j = 0; j < m; j++) {
                if ((mask & (1 << j)) == 0) { // mentor j not yet assigned
                    int nextMask = mask | (1 << j);
                    dp[nextMask] = Math.max(dp[nextMask], dp[mask] + score[studentIndex][j]);
                }
            }
        }

        return dp[(1 << m) - 1];
    }

    public int maxCompatibilitySumBest(int[][] students, int[][] mentors) {
        int m = students.length;
        Integer[] dp = new Integer[(1 << m) + 1];
        return helper(students, mentors, 0, 0, dp);
    }

    private int find(int[] arr, int[] brr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += (1 - (arr[i] ^ brr[i]));
        }
        return res;
    }

    private int helper(int[][] students, int[][] mentors, int mask, int index, Integer[] dp) {
        int m = students.length;
        int n = students[0].length;
        if (index == m)
            return 0;
        int res = 0;
        if (dp[mask] != null)
            return dp[mask];
        for (int i = 0; i < m; i++) {
            if (((mask >> i) & 1) == 0)
                res = Math.max(find(students[index], mentors[i]) + helper(students, mentors, mask | (1 << i), index + 1, dp), res);
        }
        return dp[mask] = res;
    }


}
