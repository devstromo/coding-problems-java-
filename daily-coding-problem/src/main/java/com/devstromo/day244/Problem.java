package com.devstromo.day244;

import static java.lang.Math.sqrt;

import java.util.ArrayList;
import java.util.List;

public class Problem {

    public int[] solve(int n) {
        boolean[] sieve = new boolean[n + 1];
        sieve[0] = true;
        sieve[1] = true;
        int limit = (int) sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (!sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = true;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!sieve[i]) {
                primes.add(i);
            }
        }

        return primes.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public int[] generator() {
        return new int[0];
    }
}
