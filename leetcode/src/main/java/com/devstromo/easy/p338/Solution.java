package com.devstromo.easy.p338;

class Solution {

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            // If i is even, it has the same number of 1's as i/2.
            // If i is odd, it has one more 1 than i - 1.
            result[i] = result[i / 2] + i % 2;
        }
        return result;
    }
}
