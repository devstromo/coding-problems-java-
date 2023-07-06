package com.devstromo.easy.p219;

import java.util.HashMap;

class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k)
                return true;
            map.put(nums[i], i);
        }
        return false;
    }
}
