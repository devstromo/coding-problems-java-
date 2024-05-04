package com.devstromo.dp.catalan_numbers;

public class CatalanNumbers {
    /**
     * Time: O(n^2)
     * Space: O(n)
     */
    public int catalanNumber(int n) {
        var catalan = new int[n + 2];
        catalan[0] = 1;
        catalan[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        return catalan[n];
    }

    /**
     * Time: O(n)
     * Space: O(1)
     */
    public long catalanNumberWithBinomialCoefficient(int n) {
        var coefficient = withBinomialCoefficient(2 * n, n);
        return coefficient / (n + 1);
    }

    /**
     * Time: O(n)
     * Space: O(1)
     */
    private long withBinomialCoefficient(int n, int k) {
        var res = 1L;
        // Since C(n, k) = C(n, n-k)
        if (k > n - k) {
            k = n - k;
        }
        // Calculate value of [n*(n-1)* until *(n-k+1)] /  [k*(k-1)* until *1]
        for (var i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

}
