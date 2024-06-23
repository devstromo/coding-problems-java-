package com.devstromo.medium.p673;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        final var n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return 1;
        final var lis = new int[n];
        final var count = new int[n];
        var max = Integer.MIN_VALUE;
        Arrays.fill(lis, 1);
        Arrays.fill(count, 1);
        for (var i = 1; i < n; i++) {
            for (var j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (lis[j] + 1 > lis[i]) {
                        lis[i] = lis[j] + 1;
                        count[i] = count[j];
                    } else if (lis[j] + 1 == lis[i]) {
                        count[i] += count[j];
                    }
                }
            }
            max = Math.max(max, lis[i]);
        }
        var result = 0;
        for (int i = 0; i < n; i++) {
            if (lis[i] == max) {
                result += count[i];
            }
        }
        return result;
    }

    public int findNumberOfLISBestSolution(int[] nums) {
        final var len = nums.length;
        ArrayList<int[]>[] dp = new ArrayList[len];
        for (int i = 0; i < len; i++) {
            dp[i] = new ArrayList<>();
        }
        int size = 0;
        for (int n : nums) {
            int index = bSearchLength(dp, size, n);
            int count = 1;

            if (index > 0) {
                List<int[]> t = dp[index - 1];
                int p = bSearchIndex(t, n);
                count = t.get(t.size() - 1)[1] - (p == 0 ? 0 : t.get(p - 1)[1]);
            }
            if (dp[index].size() == 0) {
                dp[index].add(new int[]{n, count});
                size++;
            } else {
                List<int[]> t = dp[index];
                int[] last = t.get(t.size() - 1);
                int ch = last[1] + count;
                if (last[0] == n) {
                    last[1] += count;
                } else {
                    t.add(new int[]{n, last[1] + count});
                }
            }
        }
        return dp[size - 1].get(dp[size - 1].size() - 1)[1];
    }

    private int bSearchLength(List<int[]>[] dp, int right, int n) {
        int left = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            if (n > dp[mid].get(dp[mid].size() - 1)[0])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    private int bSearchIndex(List<int[]> t, int num) {
        int left = 0, right = t.size() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (num <= t.get(mid)[0])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
