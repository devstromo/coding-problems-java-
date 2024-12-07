package com.devstromo.easy.p2600;

public class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (numOnes > 0) {
                sum++;
                numOnes--;
            } else if (numZeros > 0) {
                numZeros--;
            } else {
                sum--;
                numNegOnes--;
            }
        }
        return sum;
    }
}
