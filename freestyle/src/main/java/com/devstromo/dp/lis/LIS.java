package com.devstromo.dp.lis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class LIS {

    public static int lis(int[] nums) {
        var n = nums.length;
        var lis = new int[n];
        var i = 0;
        var j = 0;
        var max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }

        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (nums[j] < nums[i] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
            }
        }
        for (i = 0; i < n; i++) {
            if (max < lis[i])
                max = lis[i];
        }

        return max;
    }

    public static int lisP1(int[] nums) {
        var n = nums.length;
        var lis = new int[n];
        var max = Integer.MIN_VALUE;
        for (var i = 0; i < n; i++) {
            lis[i] = 1;
        }
        for (var i = 1; i < n; i++) {
            for (var j = 0; j < i; j++) {
                if (nums[j] < nums[i] && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        for (var i = 0; i < n; i++) {
            if (lis[i] > max)
                max = lis[i];
        }
        return max;
    }

    public static int lisP2(int[] nums) {
        var n = nums.length;
        var lis = new int[n];
        var i = 0;
        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }
        var max = Integer.MIN_VALUE;
        for (i = 1; i < n; i++) {
            for (var j = 0; j < i; j++) {
                if (nums[i] > nums[j] && Math.abs(nums[i] - nums[j]) >= 2 && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
            max = Math.max(max, lis[i]);
        }
        return max;
    }

    public static int lisP3(int[] nums) {
        return lisWithBS(Arrays.stream(nums).boxed().toList());
    }

    public static int lisWithBS(List<Integer> arr) {
        var n = arr.size();
        var tails = new int[n];
        var size = 0;
        var i = 0;
        var j = size;
        for (var k = 0; k < n; k++) {
            i = 0;
            j = size;
            // binary search variations
            while (i != j) {
                var mid = (i + j) / 2;
                if (tails[mid] < arr.get(k))
                    i = mid + 1;
                else
                    j = mid;
            }
            tails[i] = arr.get(k);
            if (i == size)
                ++size;
        }
        return size;
    }
}
