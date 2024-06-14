package com.devstromo.dp.computerNCrp;

public class ComputeNCrp {
    public int solution(int n, int r, int p) {
        if (r > n - r) {
            r = n - r;
        }

        var C = new int[r + 1];
        C[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, r); j > 0; j--) {
                C[j] = (C[j] + C[j - 1]) % p;
            }
        }
        return C[r];
    }
}
