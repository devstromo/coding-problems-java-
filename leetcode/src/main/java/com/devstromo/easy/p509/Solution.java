package com.devstromo.easy.p509;

import java.util.HashMap;

class Solution {
    private static final int[] fixedFib = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657,
      46368, 75025, 121393, 196418, 317811, 514229, 832040 };

    public static int fib(int n) {
        return fib(n, new HashMap<>());
    }

    // just trolling cuz upper is up to 30 only :)
    public static int fibStatic(int n) {
        return fixedFib[n];
    }

    private static int fib(int n, HashMap<Integer, Integer> memo) {
        if (n < 2) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, fib(n - 1) + fib(n - 2));
        return memo.get(n);
    }
}
