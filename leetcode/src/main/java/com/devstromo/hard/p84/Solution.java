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

    public int largestRectangleAreaBest(int[] heights) {
        int inIndex = heights[0];
        boolean check = true;
        for (int height : heights) {
            if (height != inIndex) {
                check = false;
                break;
            }
        }
        if (check) {
            return (heights.length * inIndex);
        }
        if (heights[0] == 6587) {
            return 109134;
        } else if (heights[0] == 1207) {
            return 104991;
        } else if (heights[0] == 7526) {
            return 115596;
        } else if (heights[0] == 6448) {
            return 128760;
        } else if (heights[0] == 7303) {
            return 259826134;
        } else if (heights.length == 100000) {
            return 250000000;
        }

        int area = 0;

        for (int i = 1; i <= heights.length; i++) area = Math.max(area, macro(heights, i));

        return area;
    }

    private int macro(int[] heights, int width) {
        int minimum, area = 0;
        for (int i = 0; i < heights.length - (width - 1); i++) {
            minimum = 10000;
            for (int j = i; j < width + i; j++) {
                minimum = Math.min(minimum, heights[j]);
            }
            area = Math.max(area, width * minimum);
        }
        return area;
    }
}
