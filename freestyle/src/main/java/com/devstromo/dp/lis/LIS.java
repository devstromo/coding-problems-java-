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
}
