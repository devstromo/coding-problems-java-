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

    public int[] nextGreaterElementsBest(int[] nums) {
        int[] output = new int[nums.length];
        int[] stack = new int[nums.length];
        int top = -1;

        for (int i = 0; i < 2 * nums.length - 1; ++i) {
            while (top > -1 && nums[stack[top]] < nums[i % nums.length]) {
                output[stack[top--]] = nums[i % nums.length];
            }
            if (i < nums.length) {
                stack[++top] = i;
            }
        }
        while (top > -1) {
            output[stack[top--]] = -1;
        }
        return output;
    }
}
