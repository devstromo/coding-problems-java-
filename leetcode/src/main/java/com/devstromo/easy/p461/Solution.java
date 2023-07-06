package com.devstromo.easy.p461;

import java.util.stream.IntStream;

class Solution {
    public static int hammingDistance(int x, int y) {
        if (x == y)
            return 0;
        var num = Integer.toBinaryString(x ^ y);
        return (int) IntStream.range(0, num.length())
          .filter(value -> num.charAt(value) == '1')
          .count();
    }
}
