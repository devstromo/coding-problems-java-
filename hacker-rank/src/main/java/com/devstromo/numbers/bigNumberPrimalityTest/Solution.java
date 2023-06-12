package com.devstromo.numbers.bigNumberPrimalityTest;

import java.math.BigInteger;

class Solution {
    public static boolean isPrime(String n) {
         return new BigInteger(n).isProbablePrime(1);
    }
}
