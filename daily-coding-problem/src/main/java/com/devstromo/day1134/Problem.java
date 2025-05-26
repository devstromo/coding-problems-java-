package com.devstromo.day1134;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem {
    // Max-heap for the lower half
    private final PriorityQueue<Integer> lower =
            new PriorityQueue<>(Comparator.reverseOrder());
    // Min-heap for the upper half
    private final PriorityQueue<Integer> higher = new PriorityQueue<>();

    /** Inserts the next value and returns the median after the insertion. */
    public double add(int value) {
        // 1. Insert
        if (lower.isEmpty() || value <= lower.peek()) {
            lower.offer(value);
        } else {
            higher.offer(value);
        }

        // 2. Re-balance (at most one element difference)
        if (lower.size() > higher.size() + 1) {
            higher.offer(lower.poll());
        } else if (higher.size() > lower.size() + 1) {
            lower.offer(higher.poll());
        }

        // 3. Median
        if (lower.size() == higher.size()) {
            // Both heaps non-empty because we maintain balance
            return (lower.peek() + higher.peek()) / 2.0;
        }
        return (lower.size() > higher.size()) ? lower.peek() : higher.peek();
    }
}
