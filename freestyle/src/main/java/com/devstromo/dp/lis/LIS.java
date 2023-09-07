package com.devstromo.dp.lis;

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
}
