package com.devstromo.numbers.bigDecimalSort;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static String[] bigDecimalSort(String[] unsorted) {
        int n = unsorted.length;
        String[] s = new String[n];
        System.arraycopy(unsorted, 0, s, 0, n);

        // Custom Comparator
        Comparator<String> customComparator = (s1, s2) -> {
            BigDecimal bd1 = new BigDecimal(s1);
            BigDecimal bd2 = new BigDecimal(s2);
            return bd2.compareTo(bd1); // descending order
        };

        // Sorting using custom comparator
        Arrays.sort(s, 0, n, customComparator);
        return s;
    }
}
