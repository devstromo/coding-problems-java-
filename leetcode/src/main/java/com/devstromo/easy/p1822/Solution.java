package com.devstromo.easy.p1822;

class Solution {

    public int arraySign(int[] nums) {
        var negatives = 0;
        for (var num : nums) {
            if (num == 0)
                return 0;
            if (num < 0)
                negatives++;
        }
        return negatives % 2 == 0 ? 1 : -1;
    }
}
