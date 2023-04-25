package com.devstromo.kyu5.mean_square_error;

import static java.lang.Math.abs;

import java.util.stream.IntStream;

class Solution {
    public static double solution(int[] a1, int[] a2) {
        var sum = 0;
        for (var index = 0; index < a2.length; index++) {
            sum += square(abs(a1[index] - a2[index]));
        }
        return (double) sum / (double) a1.length;
    }

    public static double solutionIntStream(int[] arr1, int[] arr2) {
        return IntStream.range(0, arr1.length)
          .map(i -> arr1[i] - arr2[i])
          .map(diff -> diff * diff)
          .average()
          .getAsDouble();
    }

    private static int square(int num) {
        if (num < 0)
            num = -num;
        var power = 0;
        var result = 0;
        var temp = num;

        while (temp > 0) {
            if ((temp & 1) > 0) {
                result += (num << power);
            }
            power++;
            temp = temp >> 1;
        }
        return result;
    }
}
