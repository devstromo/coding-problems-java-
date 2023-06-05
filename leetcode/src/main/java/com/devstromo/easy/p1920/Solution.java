package com.devstromo.easy.p1920;

class Solution {

    public static int[] buildArray(int[] nums) {
        int[] result =  new int[nums.length];
        for(int i = 0; i < nums.length; ++i) {
            result[i] = nums[nums[i]];
        }
        System.gc();
        return result;
    }

    public static int[] buildArrayNotExtraSpace(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] += n * (nums[nums[i]] % n);
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        return nums;
    }
}
