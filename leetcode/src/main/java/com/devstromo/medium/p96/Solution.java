package com.devstromo.medium.p96;

class Solution {
    public int numTrees(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * (4L * i - 2)) / (i + 1);
        }
        return (int) result;
    }
}
