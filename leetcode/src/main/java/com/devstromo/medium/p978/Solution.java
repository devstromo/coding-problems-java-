package com.devstromo.medium.p978;

public class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int max = 1;
        int inc = 1;
        int dec = 1;

        for (int k = 1; k < n; k++) {
            if (arr[k] > arr[k - 1]) {
                inc = dec + 1;
                dec = 1;
            } else if (arr[k] < arr[k - 1]) {
                dec = inc + 1;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            max = Math.max(max, Math.max(inc, dec));
        }

        return max;
    }
}
