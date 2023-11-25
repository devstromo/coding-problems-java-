package com.devstromo.easy.p191;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bits = n;
        int count = 0;
        while (bits != 0) {
            count += bits & 1;
            bits = bits >>> 1; // Unsigned right shift
        }
        return count;
    }
}
