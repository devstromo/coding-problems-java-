package com.devstromo.easy.p2824;

import java.util.List;

class Solution {
    public static int countPairs(List<Integer> nums, int target) {
        var count = 0;
        for (var i = 0; i < nums.size() - 1; i++) {
            for (var j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target)
                    count++;
            }
        }
        return count;
    }
}
