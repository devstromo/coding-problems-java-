package com.devstromo.easy.p1281;

class Solution {
    public static int subtractProductAndSum(int n) {
        var value = String.valueOf(n);
        var mul = 1;
        var sum = 0;
        for (var i = 0; i < value.length(); i++) {
            var convert = Integer.parseInt(value.charAt(i) + "");
            mul *= convert;
            sum += convert;
        }
        return mul - sum;
    }

    public static int subtractProductAndSumBest(int n) {
        var remainder = 0;
        var res = n;
        var cumulative = new int[2];
        cumulative[1] = 1;
        while (res > 0) {
            remainder = res % 10;
            cumulative[0] = cumulative[0] + remainder;
            cumulative[1] = cumulative[1] * remainder;
            res = res / 10;
        }
        return cumulative[1] - cumulative[0];
    }
}
