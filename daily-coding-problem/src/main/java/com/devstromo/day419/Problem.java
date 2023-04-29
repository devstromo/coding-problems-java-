package com.devstromo.day419;

import static java.lang.Math.sqrt;

public class Problem {
    public static int findStepsToOne(int n) {
        var steps = 0;
        while (n > 1) {
            if (isPerfectSquare(n)) {
                n = (int) sqrt(n);
            } else {
                n = n - 1;
            }
            steps++;
        }

        return steps;
    }

    // perfect squares can only end in 0, 1, 4, or 9 in base 16
    private static boolean isPerfectSquare(long n) {
        if (n < 0) {
            return false;
        }
        switch ((int) (n & 0xF)) {
        case 0:
        case 1:
        case 4:
        case 9:
            long tst = (long) sqrt(n);
            return tst * tst == n;
        default:
            return false;
        }
    }
}
