package com.devstromo.easy.p338;

class Solution {

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // If i is even, it has the same number of 1's as i/2.
            // If i is odd, it has one more 1 than i - 1.
            result[i] = result[i / 2] + i % 2;
        }
        return result;
    }

    public int[] countBitsRecursive(int n) {
        int[] result = new int[n + 1];
        countBitsRecursive(1, result, n);
        return result;
    }

    private void countBitsRecursive(int index, int[] result, int n) {
        if (index == n + 1) {
            return;
        }
        result[index] = result[index / 2] + index % 2;
        countBitsRecursive(index + 1, result, n);
    }
}
