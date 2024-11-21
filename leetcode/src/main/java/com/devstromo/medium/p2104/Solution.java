package com.devstromo.medium.p2104;

import java.util.Stack;

public class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] < nums[i])) {
                int index = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                long count = (long) (index - left) * (i - index);
                sum += count * nums[index];
            }
            stack.push(i);
        }

        stack.clear();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] > nums[i])) {
                int index = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                long count = (long) (index - left) * (i - index);
                sum -= count * nums[index];
            }
            stack.push(i);
        }

        return sum;
    }

    public long subArrayRangesBest(int[] nums) {
        long sum = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int left = i;
            int right = i;
            while(left > 0 && nums[left - 1] <= nums[i]) left--;
            while(right < n - 1 && nums[right + 1] < nums[i]) right++;

            sum += (long)(nums[i] * (long)(right - i + 1) * (long)(i - left + 1));

            left = i;
            right = i;
            while(left > 0 && nums[left - 1] >= nums[i]) left--;
            while(right < n - 1 &&nums [right + 1] > nums[i]) right++;

            sum -= (long)(nums[i] * (long)(right - i + 1) * (long)(i - left + 1));
        }

        return sum;
    }
}
