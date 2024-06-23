package com.devstromo.medium.p673;

import java.util.Arrays;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        final var n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return 1;
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
}
