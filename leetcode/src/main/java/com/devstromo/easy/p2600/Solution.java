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

    public int kItemsWithMaximumSumBest(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) return k;
        int sum = numOnes + numZeros, sum2 = numOnes + numZeros + numNegOnes;
        if (k > sum && k <= sum2) return numOnes - (k - sum);
        return numOnes;
    }
}
