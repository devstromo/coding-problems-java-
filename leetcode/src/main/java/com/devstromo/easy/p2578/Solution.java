package com.devstromo.easy.p2578;

import java.util.Arrays;

public class Solution {
    public int splitNum(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        Arrays.sort(digits);
        int[] result = {0, 0};
        for (int i = 0; i < digits.length; ++i) {
            result[i % 2] *= 10;
            result[i % 2] += digits[i] - '0';
        }
        return result[0] + result[1];
    }
}
