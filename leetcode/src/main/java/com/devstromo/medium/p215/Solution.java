package com.devstromo.medium.p215;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        final var pq = new PriorityQueue<Integer>(n, Collections.reverseOrder());
        for (int num : nums) {
            pq.offer(num);
        }
        for (int i = 1; i < k; i++) {
            pq.poll();
        }
        return pq.peek();
    }
}
