package com.devstromo.kyu4.Hamming;

class Hamming {
    //A Hamming number is a positive integer of the form 2i3j5k, for some non-negative integers i, j, and k.
    //
    //Write a function that computes the nth smallest Hamming number.
    //
    //Specifically:
    //
    //    The first smallest Hamming number is 1 = 203050
    //    The second smallest Hamming number is 2 = 213050
    //    The third smallest Hamming number is 3 = 203150
    //    The fourth smallest Hamming number is 4 = 223050
    //    The fifth smallest Hamming number is 5 = 203051
    //
    //The 20 smallest Hamming numbers are given in the Example test fixture.
    //
    //Your code should be able to compute the first 5 000 ( LC: 400, Clojure: 2 000, Haskell: 12 691, NASM, C, D, C++, Go and Rust: 13 282 ) Hamming numbers without timing out.

    public static long hamming(int n) {
        if (n <= 0) {
            return 0;
        }
        long[] hammingNumbers = new long[n];
        hammingNumbers[0] = 1;

        int twoIndex = 0, threeIndex = 0, fiveIndex = 0;
        long nextTwo = 2, nextThree = 3, nextFive = 5;

        for (int i = 1; i < n; i++) {
            hammingNumbers[i] = Math.min(nextTwo, Math.min(nextThree, nextFive));
            if (hammingNumbers[i] == nextTwo) {
                twoIndex++;
                nextTwo = hammingNumbers[twoIndex] * 2;
            }
            if (hammingNumbers[i] == nextThree) {
                threeIndex++;
                nextThree = hammingNumbers[threeIndex] * 3;
            }
            if (hammingNumbers[i] == nextFive) {
                fiveIndex++;
                nextFive = hammingNumbers[fiveIndex] * 5;
            }
        }
        return hammingNumbers[n - 1];
    }

    public static long hammingBest(int n) {
        long[] h = new long[n];
        h[0] = 1;
        long x2 = 2, x3 = 3, x5 = 5;
        int i = 0, j = 0, k = 0;

        for (int index = 1; index < n; index++) {
            h[index] = Math.min(x2, Math.min(x3, x5));
            if (h[index] == x2) x2 = 2 * h[++i];
            if (h[index] == x3) x3 = 3 * h[++j];
            if (h[index] == x5) x5 = 5 * h[++k];
        }

        return h[n - 1];
    }
}
