package com.devstromo.kyu6.MinNbDiv;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MinNbDiv {
    private final static Set<Integer> PRIME_NUMBERS = Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
      101, 103);
    // TLE
    public static int findMinNumTLE(int num) {
        int[] factors = new int[num];
        int index = 0;
        int number = 1;
        while (index < num) {
            int k = countDivisors(number, new HashMap<>());
            if (k <= num && factors[k - 1] == 0) {
                factors[k - 1] = number;
                index++;
            }
            number++;
        }
        return factors[num - 1];
    }

    public static int findMinNum(int num) {
        if (num == 1)
            return 1;
        int index = 2;
        while (true) {
            int count = 2;
            for (int j = 2; j <= index / 2; j++) {
                if (index % j == 0)
                    count++;
            }
            if (num == count)
                return index;
            index++;
        }
    }

    public static int findMinNumSolution(int num) {
        int divCount = 0;
        int value = 0;
        while (divCount != num) {
            value++;
            divCount = 0;
            for (int i = 1; i <= value; i++)
                if (value % i == 0)
                    divCount++;
        }

        return value;
    }

    public static int findMinNumTest(int num) {
        int result = num;
        if (num > 2) {
            if (PRIME_NUMBERS.contains(num)) {
                result = 1 << (num - 1);
            } else {
                while (factorization(result) != num) {
                    result++;
                }
            }
        }
        return result;
    }

    private static int factorization(long x) {
        int count = 0;
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                count++;
                if (x / i != i) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int countDivisors(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int count = 0;
        for (int i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                if (i == n / i)
                    count++;
                else
                    count += 2;
            }
        }
        memo.put(n, count);
        return count;
    }

}
