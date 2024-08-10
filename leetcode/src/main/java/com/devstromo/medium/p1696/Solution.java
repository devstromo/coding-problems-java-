package com.devstromo.medium.p1696;

import java.util.PriorityQueue;

public class Solution {
    public int maxResult(int[] nums, int k) {
        final var n = nums.length;
        var max = nums[0];
        final var priorityQueue = new PriorityQueue<int[]>((a, b) -> b[1] - a[1]);
        priorityQueue.offer(new int[]{0, max});
        for (int i = 1; i < n; i++) {
            while (true) {
                assert priorityQueue.peek() != null;
                if (!(i - priorityQueue.peek()[0] > k)) break;
                priorityQueue.poll();
            }
            max = priorityQueue.peek()[1] + nums[i];
            priorityQueue.offer(new int[]{i, max});
        }
        return max;
    }
}
