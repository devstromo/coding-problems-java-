package com.devstromo.easy.p26;

class Solution {
    public static int removeDuplicates(int[] nums) {
        var cont = 0;
        for (var num : nums) {
            if (cont == 0 || num > nums[cont - 1])
                nums[cont++] = num;
        }
        return cont;
    }
}
