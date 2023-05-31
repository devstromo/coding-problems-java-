package com.devstromo.kyu4.FactorialTail;

import java.util.Arrays;

class FactorialTail {
    public static int zeroes (int base, int number) {
        int[] factors = new int[257];
        int b = base;
        for (int i = 2; i <= b; i++) {
            while (b % i == 0) {
                factors[i]++;
                b /= i;
            }
        }

        long res = Long.MAX_VALUE;
        for (int i = 2; i <= base; i++) {
            if (factors[i] > 0) {
                long count = 0;
                long t = number;
                while (t / i > 0) {
                    count += t / i;
                    t /= i;
                }
                res = Math.min(res, count / factors[i]);
            }
        }
        return (int) res;
    }
}
