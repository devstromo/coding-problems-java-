package com.devstromo.easy.p1929;

class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int[] result = new int[n];
        int m = n / 2;
        for (int i = 0; i < m; i++) {
            result[i] = result[i + m] = nums[i];
        }
        System.gc();
        return result;
    }
}
