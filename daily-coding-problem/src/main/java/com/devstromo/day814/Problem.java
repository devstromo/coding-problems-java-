package com.devstromo.day814;

import java.util.LinkedList;

public class Problem {

    public long sumTwoLinkedList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        var first = 0L;
        var second = 0L;
        var pos = 0;
        final var n = list1.size();
        final var m = list2.size();

        for (pos = 0; pos < n; pos++) {
            first += list1.get(pos) * pow(pos);
        }
        for (pos = 0; pos < m; pos++) {
            second += list2.get(pos) * pow(pos);
        }
        return first + second;
    }

    private long pow(long exp) {
        long result = 1;
        long base = 10;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= base;
            }
            base *= base;
            exp >>= 1;
        }
        return result;
    }
}
