package com.devstromo.easy.p1491;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.util.Arrays.sort;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public double average(int[] salary) {
        sort(salary);
        var count = 0;
        var total = 0;
        for (var i = 1; i < salary.length - 1; i++) {
            total += salary[i];
            count++;
        }
        return new BigDecimal(Double.toString((double) total / count)).setScale(5, RoundingMode.HALF_UP)
          .doubleValue();
    }

    public double averageSimple(int[] salary) {
        var min = MAX_VALUE;
        var max = MIN_VALUE;
        var sum = 0;
        for (var amount : salary) {
            min = Integer.min(min, amount);
            max = Integer.max(max, amount);
            sum += amount;
        }
        return (double) (sum - max - min) / (salary.length - 2);
    }
}
