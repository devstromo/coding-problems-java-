package com.devstromo.easy.p703;

import java.util.PriorityQueue;

class KthLargest {
    private final int k;
    private final PriorityQueue<Integer> head;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.head = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (head.size() < k) {
            head.offer(val);
        } else if (val > head.peek()) {
            head.poll();
            head.offer(val);
        }
        return head.peek();
    }
}
