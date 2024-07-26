package com.devstromo.day849;

public class Problem {

    public int solve(long n) {
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
}
