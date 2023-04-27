package com.devstromo.medium.p319;

class Solution {
    public static int bulbSwitch(int n) {
        var count = 0;
        for (var i = 1; i * i <= n; i++) {
            count++;
        }
        return count;
    }
}
