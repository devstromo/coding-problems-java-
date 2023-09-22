package com.devstromo.easy.p1464;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public static int maxProduct(int[] nums) {
        var n = nums.length;
        Arrays.sort(nums);
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }

    public static int maxProductPQ(int[] nums) {
        var n = nums.length;
        var queue = new PriorityQueue<Integer>(nums.length, Collections.reverseOrder());
        for (var i = 0; i < n; i++) {
            queue.add(nums[i]);
        }
        return (queue.poll() - 1) * (queue.poll() - 1);
    }

    public static int maxProductBest(int[] nums) {
        var first = Integer.MIN_VALUE;
        var second = Integer.MIN_VALUE;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
            } else if (nums[i] >= second) {
                second = nums[i];
            }
        }
        return (first - 1) * (second - 1);
    }
}
