package com.devstromo.dynamic_programming.lis;

import java.util.List;

class Result {
    public static int longestIncreasingSubsequence(List<Integer> arr) {
        var n = arr.size();
        var tails = new int[n];
        var size = 0;
        var i = 0;
        var j = size;
        for (var k = 0; k < n; k++) {
            i = 0;
            j = size;
            while (i != j) {
                var mid = (i + j) / 2;
                if (tails[mid] < arr.get(k))
                    i = mid + 1;
                else
                    j = mid;
            }
            tails[i] = arr.get(k);
            if (i == size)
                ++size;
        }
        return size;
    }
}
