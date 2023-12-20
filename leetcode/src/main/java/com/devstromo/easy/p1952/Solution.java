package com.devstromo.easy.p1952;

public class Solution {
    public boolean isThree(int n) {
        var count = 0;
        var div = 1;
        while (div <= n) {
            if (n % div == 0) {
                count++;
                if (count > 3) {
                    break;
                }
            }
            div++;
        }
        return count == 3;
    }
}
