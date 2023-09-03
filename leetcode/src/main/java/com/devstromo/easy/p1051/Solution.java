package com.devstromo.easy.p1051;

import static java.lang.System.arraycopy;

import java.util.Arrays;

class Solution {
    public static int heightChecker(int[] heights) {
        var n = heights.length;
        var temp = new int[n];
        for (var i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(temp);
        var changes = 0;
        for (var i = 0; i < heights.length; i++) {
            if (temp[i] != heights[i])
                changes++;
        }
        return changes;
    }

    public static int heightCheckerMerge(int[] heights) {
        var n = heights.length;
        var temp = new int[n];
        for (int i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }
        mergesort(temp, 0, n - 1);
        var changes = 0;
        for (int i = 0; i < heights.length; i++) {
            if (temp[i] != heights[i])
                changes++;
        }
        return changes;
    }

    private static void merge(int[] arr, int p, int q, int r) {
        var n1 = q - p + 1;
        var n2 = r - q;

        var left = new int[n1];
        var middle = new int[n2];

        for (var i = 0; i < n1; i++)
            left[i] = arr[p + i];
        for (var i = 0; i < n2; i++)
            middle[i] = arr[q + 1 + i];

        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        while (i < n1 && j < n2) {
            if (left[i] <= middle[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = middle[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = middle[j];
            j++;
            k++;
        }
    }

    private static void mergesort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
