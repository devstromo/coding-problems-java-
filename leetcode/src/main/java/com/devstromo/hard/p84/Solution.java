package com.devstromo.hard.p84;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        right[n - 1] = n;
        left[0] = -1;
        int position;
        for (int i = 1; i < n; i++) {
            position = i - 1;
            while (position >= 0 && heights[position] >= heights[i]) position = left[position];
            left[i] = position;
        }
        for (int i = n - 2; i >= 0; i--) {
            position = i + 1;
            while (position < n && heights[position] >= heights[i]) position = right[position];
            right[i] = position;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, heights[i] * (right[i] - left[i] - 1));
        }
        return max;
    }
}
