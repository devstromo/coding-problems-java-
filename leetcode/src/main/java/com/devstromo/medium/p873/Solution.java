package com.devstromo.medium.p873;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        int[][] dp = new int[n][n];
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int prev = arr[i] - arr[j];
                if (indexMap.containsKey(prev) && indexMap.get(prev) < j) {
                    int k = indexMap.get(prev);
                    dp[j][i] = dp[k][j] + 1;
                    maxLen = Math.max(maxLen, dp[j][i]);
                } else {
                    dp[j][i] = 2;
                }
            }
        }

        return maxLen >= 3 ? maxLen : 0;
    }
}
