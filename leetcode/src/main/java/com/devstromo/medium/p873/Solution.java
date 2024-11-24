package com.devstromo.medium.p873;

import java.util.HashMap;
import java.util.HashSet;
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

    public int lenLongestFibSubseqBest(int[] arr) {
        final var index = new HashSet<>();
        for (int n : arr) {
            index.add(n);
        }
        int max = 2;
        for (int i = 0; i < arr.length - max; i++) {
            if (arr[i] * Math.pow(1.618, max - 1) > arr[arr.length - 1])
                break;
            for (int j = i + 1; j < arr.length - max + 1; j++) {
                if (arr[j] * Math.pow(1.618, max - 2) > arr[arr.length - 1])
                    break;
                int n2 = arr[i];
                int n1 = arr[j];
                int len = 2;
                while (index.contains(n1 + n2)) {
                    n1 = n1 + n2;
                    n2 = n1 - n2;
                    len++;
                }
                if (len > max)
                    max = len;
            }
        }
        return max < 3 ? 0 : max;
    }
}
