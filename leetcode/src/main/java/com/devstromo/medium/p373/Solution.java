package com.devstromo.medium.p373;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.first));
        for (int i = 0; i < nums1.length && i < k; i++) {
            pq.offer(new Pair(nums1[i] + nums2[0], 0));
        }

        while (k > 0 && !pq.isEmpty()) {
            Pair p = pq.poll();
            int sum = p.first;
            int position = p.second;
            result.add(List.of(sum - nums2[position], nums2[position]));

            if (position + 1 < nums2.length) {
                pq.offer(new Pair(sum - nums2[position] + nums2[position + 1], position + 1));
            }
            k--;
        }
        return result;
    }

    record Pair(int first, int second) {
    }

}
