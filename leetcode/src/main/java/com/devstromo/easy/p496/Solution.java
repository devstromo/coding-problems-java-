package com.devstromo.easy.p496;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        var map = new HashMap<Integer, Integer>();
        var stack = new Stack<Integer>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.getOrDefault(nums1[i], -1);
        return nums1;
    }

    public int[] nextGreaterElementBestVariant(int[] nums1, int[] nums2) {
        var vocab = new HashMap<Integer, Integer>();
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) vocab.put(nums2[i], i);
        for (int i = 0; i < nums1.length; i++) result[i] = greater(vocab.get(nums1[i]), nums2);
        return result;
    }

    public int[] nextGreaterElementBest(int[] nums1, int[] nums2) {
        int[] vocab = new int[10001];
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) vocab[nums2[i]] = i;
        for (int i = 0; i < nums1.length; i++) result[i] = greater(vocab[nums1[i]], nums2);
        return result;
    }

    public int greater(int idx, int[] nums2) {
        for (int j = idx + 1; j < nums2.length; j++) {
            if (nums2[j] > nums2[idx]) return nums2[j];
        }
        return -1;
    }
}
