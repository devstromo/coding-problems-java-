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

    public int findKthLargestBest(int[] nums, int k) {
        int[] present = new int[20001];
        for (int n : nums) {
            present[10000 + n] += 1;
        }
        for (int i = present.length - 1; i >= 0; i--) {
            k -= present[i];
            if (k <= 0) return i - 10000;
        }
        return -1;
    }
}
