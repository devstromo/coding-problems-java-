package com.devstromo.medium.p2542;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/*
You are given two 0-indexed integer arrays nums1 and nums2 of equal length n and a positive integer k. You must choose a subsequence of indices from nums1 of length k.

For chosen indices i0, i1, ..., ik - 1, your score is defined as:

    The sum of the selected elements from nums1 multiplied with the minimum of the selected elements from nums2.
    It can defined simply as: (nums1[i0] + nums1[i1] +...+ nums1[ik - 1]) * min(nums2[i0] , nums2[i1], ... ,nums2[ik - 1]).

Return the maximum possible score.

A subsequence of indices of an array is a set that can be derived from the set {0, 1, ..., n-1} by deleting some or no elements.
 */
class Pair {
    int first, second;

    Pair(int a, int b) {
        first = a;
        second = b;
    }
}

class Solution {
    public static long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[] { nums2[i], nums1[i] };
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long res = 0, totalSum = 0;
        for (int[] pair : pairs) {
            pq.add(pair[1]);
            totalSum += pair[1];
            if (pq.size() > k) {
                totalSum -= pq.poll();
            }
            if (pq.size() == k) {
                res = Math.max(res, totalSum * pair[0]);
            }
        }
        return res;
    }

    public static long maxScorePair(int[] nums1, int[] nums2, int k) {
        Pair[] pairs = new Pair[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            pairs[i] = new Pair(nums1[i], nums2[i]);
        }
        Arrays.sort(pairs, (a, b) -> b.second - a.second);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Comparator.comparingInt(a -> a));
        long result = 0;
        long total = 0;
        for (Pair pair : pairs) {
            pq.add(pair.first);
            total += pair.first;
            if (pq.size() > k) {
                total -= pq.poll();
            }
            if (pq.size() == k) {
                result = Math.max(result, total * pair.second);
            }
        }
        return result;
    }

    public static long maxScoreBestMemory(int[] nums1, int[] nums2, int k) {
        List<int[]> list = new LinkedList<>();
        for(int i=0; i<nums1.length; i++) {
            list.add(new int[] {nums1[i], nums2[i]});
        }
        Collections.sort(list, (a, b) -> b[0] - a[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>(k+1, (a,b) -> a[1] - b[1]);
        long sum = 0, max = 0;
        for(int[] elem: list) {
            pq.add(elem);
            sum += elem[0];
            if(pq.size() > k) {
                sum -= pq.poll()[0];
            }
            if(pq.size() == k) {
                max = Math.max(max, sum * pq.peek()[1]);
            }
        }
        return max;
    }

}
