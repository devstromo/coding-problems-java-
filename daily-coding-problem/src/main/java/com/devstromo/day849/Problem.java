package com.devstromo.day849;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public long solveRecursiveMemo(long n) {
        return solveRecursiveMemo(n, new HashMap<>());
    }

    public Map<Integer, Long> longestSequences() {
        var max = Long.MIN_VALUE;
        var num = 0;
        for (int i = 1; i < 1_000_000; i++) {
            long iterations = solveRecursiveMemo(i);
            if (iterations > max) {
                max = iterations;
                num = i;
            }
        }
        return Map.of(num, max);
    }

    public Map<Integer, Long> longestSequencesWithCache() {
        long maxIters = -1;
        int number = 0;
        final int[] cache = new int[1000001];
        Arrays.fill(cache, -1);
        cache[1] = 1;

        for (int i = 2; i <= 1000000; i++) {
            long n = i;
            int iterations = 0;

            // Compute the number of iterations for the current number `i`
            while (n != 1 && n >= i) {
                iterations++;
                if ((n & 1) == 1) { // n is odd
                    n = 3 * n + 1;
                } else { // n is even
                    n /= 2;
                }
            }

            // Use cached value for numbers less than `i`
            cache[i] = iterations + cache[(int) n];

            // Update maxIters and number if the current count is greater
            if (cache[i] > maxIters) {
                maxIters = cache[i];
                number = i;
            }
        }

        return Map.of(number, maxIters);
    }

    private long solveRecursiveMemo(long n, Map<Long, Long> memo) {
        if (n == 1) {
            return 0;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n % 2 == 0) {
            memo.put(n, solveRecursive(n / 2) + 1);
        } else {
            memo.put(n, solveRecursive(3 * n + 1) + 1);
        }
        return memo.get(n);
    }
}
