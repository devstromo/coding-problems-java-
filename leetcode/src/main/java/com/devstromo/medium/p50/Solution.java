package com.devstromo.medium.p50;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE) {
            if (x == 1.0 || x == -1.0) return 1.0;
            else return 0.0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        final var result = pow(x, n);
        var bd = new BigDecimal(result);
        bd = bd.setScale(5, RoundingMode.DOWN);
        return bd.doubleValue();
    }

    public double myPowOptimized(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        var result = 1.0000;
        while (n != 0) {
            if ((n & 1) != 0) {
                result *= x;
            }
            x *= x;
            n >>>= 1;
        }

        return result;
    }

    private double pow(double x, int n) {
        if (n == 0) return 1.0;
        var half = pow(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return half * half * x;
    }
}
