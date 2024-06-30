package com.devstromo.day814;

import java.util.LinkedList;

public class Problem {

    public long sumTwoLinkedList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        if (list1 == null && list2 == null) {
            return 0;
        }
        if (list2 == null) {
            return listNumberRepresentation(list1, list1.size());
        }
        if (list1 == null) {
            return listNumberRepresentation(list2, list2.size());
        }
        var first = listNumberRepresentation(list1, list1.size());
        var second = listNumberRepresentation(list2, list2.size());
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

    private long listNumberRepresentation(LinkedList<Integer> list, int size) {
        var result = 0L;
        for (int pos = 0; pos < size; pos++) {
            result += list.get(pos) * pow(pos);
        }
        return result;
    }
}
