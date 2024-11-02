package com.devstromo.medium.p503;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        final var stack = new Stack<Integer>();

        Arrays.fill(result, -1);

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }

        return result;
    }
}
