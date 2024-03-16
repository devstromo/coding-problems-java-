package com.devstromo.easy.p283;

class Solution {
    public void moveZeroes(int[] nums) {
        var insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}