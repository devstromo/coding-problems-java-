package com.devstromo.easy.p202;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            if (!seen.add(n)) {
                return false;
            }
            n = sumOfSquares(n);
        }
        return true;
    }

    public boolean isHappyBest(int n) {
        while (n > 9) {
            n = sumOfSquares(n);
        }
        return n == 1 || n == 7;
    }

    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
