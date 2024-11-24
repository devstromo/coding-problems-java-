package com.devstromo.easy.p1137;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int tribonacci(int n) {
        return tribonacci(n, new HashMap<>());
    }

    public static int tribonacciBest(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else if (i == 1 || i == 2) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
            }
        }
        return arr[n];
    }

    public static int tribonacciNoAditional(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        int d;
        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }

    public static int tribonacci(int n, Map<Integer, Integer> memo) {
        if (n < 2) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, tribonacci(n - 1, memo) + tribonacci(n - 2, memo) + tribonacci(n - 3, memo));
        return memo.get(n);
    }
}
