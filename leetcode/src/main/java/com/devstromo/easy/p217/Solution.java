package com.devstromo.easy.p217;

import java.util.HashSet;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        var cache = new HashSet<Integer>();
        for (var num : nums) {
            if (cache.contains(num)) {
                return true;
            }
            cache.add(num);
        }
        return false;
    }
}
