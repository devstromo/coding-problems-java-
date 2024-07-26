package com.devstromo.day849;

public class Problem {

    public long solve(long n) {
        var iterations = 0;
        while (n > 1) {
            iterations++;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return iterations;
    }

    public long solveRecursive(long n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return solveRecursive(n / 2) + 1;
        }
        return solveRecursive(3 * n + 1) + 1;
    }
}
