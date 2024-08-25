package com.devstromo.medium.p646;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        int max = 0;
        int currentEnd = Integer.MIN_VALUE;

        for (int[] pair : pairs) {
            if (pair[0] > currentEnd) {
                max++;
                currentEnd = pair[1];
            }
        }
        return max;
    }

    public int findLongestChainBest(int[][] pairs) {
        int minL = Integer.MAX_VALUE, maxR = Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            int l = pair[0], r = pair[1];
            minL = Math.min(minL, l);
            maxR = Math.max(maxR, r);
        }
        int[] rtol = new int[maxR - minL + 2];
        for (int[] pair : pairs) {
            int l = pair[0] - minL + 1, r = pair[1] - minL + 1;
            rtol[r] = Math.max(rtol[r], l);
        }
        int curMax = 0, ans = 0;
        for (int r = 1; r <= maxR - minL + 1; ++r) {
            if (rtol[r] > curMax) {
                curMax = r;
                ++ans;
            }
        }
        return ans;
    }
}
