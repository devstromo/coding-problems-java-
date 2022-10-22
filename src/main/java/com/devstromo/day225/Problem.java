package com.devstromo.day225;

// Josephus based problem
public class Problem {
    public int solve(int n, int k) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (k == 2) {
            return ~Integer.highestOneBit(n * 2) & ((n << 1) | 1);
        } else {
            return josephus(n, k) + 1;
        }
    }

    private int josephus(int n, int k) {
        if (n == 1)
            return 0;
        return (josephus(n - 1, k) + k) % n;
    }
}
