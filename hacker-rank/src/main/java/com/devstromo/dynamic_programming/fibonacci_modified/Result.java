package com.devstromo.dynamic_programming.fibonacci_modified;

import java.math.BigInteger;

class Result {

    /*
     * Complete the 'fibonacciModified' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER t1
     *  2. INTEGER t2
     *  3. INTEGER n
     */

    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        var sum = new BigInteger[n];
        sum[0] = new BigInteger(String.valueOf(t1));
        sum[1] = new BigInteger(String.valueOf(t2));
        for (int i = 2; i < n; i++) {
            sum[i] = sum[i - 2].add(sum[i - 1].pow(2));
        }
        return sum[n - 1];
    }

}