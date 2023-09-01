package com.devstromo.easy.p2652;

class Solution {
    public static int sumOfMultiples(int n) {
        var count = 0;
        for (var i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                count += i;
            }
        }
        return count;
    }

    public static int sumOfMultiplesBest(int n) {
        return op(n, 3) + op(n, 5) + op(n, 7) - op(n, 3 * 5) - op(n, 3 * 7) - op(n, 5 * 7) + op(n, 3 * 5 * 7);
    }

    /**
     * The method calculates the sum of the first (n / k) multiples of k. Let's break down the method to understand the formula:
     * n / k: This gives the number of multiples of k that are less than or equal to n.
     * (n / k + 1): When you want to sum the first (n / k) numbers, this gives the next number.
     * k * (n / k): This gives the largest multiple of k that is less than or equal to n.
     * k * (n / k) * (n / k + 1) / 2: This calculates the sum of the first (n / k) multiples of k.
     *
     */
    private static int op(int n, int k) {
        return k * (n / k) * (n / k + 1) / 2;
    }
}
