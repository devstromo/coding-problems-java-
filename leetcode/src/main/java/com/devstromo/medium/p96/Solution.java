package com.devstromo.medium.p96;

class Solution {
    public int numTrees(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * (4L * i - 2)) / (i + 1);
        }
        return (int) result;
    }

    public int numTreesWithCatalanBinomialCoefficient(int n) {
        var coefficient = withBinomialCoefficient(2 * n, n);
        return (int) (coefficient / (n + 1));
    }

    private long withBinomialCoefficient(int n, int k) {
        var res = 1L;
        if (k > n - k) {
            k = n - k;
        }
        for (var i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
