package com.devstromo.hard.p1964;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int[] longestObstacleCourseAtEachPositionList(int[] obstacles) {
        var dp = new ArrayList<Integer>();
        var res = new int[obstacles.length];
        for (var i = 0; i < obstacles.length; i++) {
            var index = binarySearch(dp, obstacles[i]);
            if (index < 0) {
                index = -(index + 1);
            }
            if (index == dp.size()) {
                dp.add(obstacles[i]);
            } else {
                dp.set(index, obstacles[i]);
            }
            res[i] = index + 1;
        }
        return res;
    }

    public static int[] longestObstacleCourseAtEachPositionDP(int[] obstacles) {
        var dp = new int[obstacles.length];
        var length = 0;
        var result = new int[obstacles.length];
        for (var i = 0; i < obstacles.length; i++) {
            var index = binarySearch(dp, length - 1, obstacles[i]);
            dp[index] = obstacles[i];
            if (index == length) {
                length++;
            }
            result[i] = index + 1;
        }
        return result;
    }

    private static int binarySearch(List<Integer> list, int target) {
        var low = 0;
        var high = list.size() - 1;
        while (low <= high) {
            var mid = (low + high) / 2;
            var midVal = list.get(mid);
            if (midVal <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int binarySearch(int[] dp, int right, int target) {
        var left = 0;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            if (dp[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
