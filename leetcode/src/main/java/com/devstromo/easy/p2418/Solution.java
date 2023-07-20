package com.devstromo.easy.p2418;

import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static String[] sortPeople(String[] names, int[] heights) {
        var map = new HashMap<Integer, String>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0, j = heights.length - 1; i < heights.length / 2; i++) {
            int tmp = heights[i];
            heights[i] = heights[j];
            heights[j] = tmp;
            j--;
        }

        var result = new String[heights.length];
        for (int i = 0; i < heights.length; i++) {
            result[i] = map.get(heights[i]);
        }
        return result;
    }
}
