package com.devstromo.easy.p1486;

class Solution {
    public static int xorOperation(int n, int start) {
        var result = 0;
        for (var i = 0; i < n; i++) {
            result ^= start + 2 * i;
        }
        return result;
    }

    public int xorOperationBestMemory(int n, int start) {
        int[] a = new int[n];
        int s = start;
        int p = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s;
            s = s + 2;
        }
        for (int i = 0; i < a.length; i++) {
            p = p ^ a[i];
        }
        return p;
    }
}
