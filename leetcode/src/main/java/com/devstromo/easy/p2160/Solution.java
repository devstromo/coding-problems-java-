package com.devstromo.easy.p2160;

import java.util.Arrays;

class Solution {
    public static int minimumSum(int num) {
        var numbers = String.valueOf(num)
          .toCharArray();
        Arrays.sort(numbers);
        return (numbers[0] - '0' + numbers[1] - '0') * 10 + numbers[2] - '0' + numbers[3] - '0';
    }
}
