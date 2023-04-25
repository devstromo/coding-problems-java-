package com.devstromo.day310;

public class Problem {

    public int solve(int n) {
        return getSetBitsFromOneToN(n);
    }

    private int getSetBitsFromOneToN(int number) {
        int two = 2, ans = 0;
        int n = number;
        while (n != 0) {
            ans += (number / two) * (two >> 1);
            if ((number & (two - 1)) > (two >> 1) - 1)
                ans += (number & (two - 1)) - (two >> 1) + 1;
            two <<= 1;
            n >>= 1;
        }
        return ans;
    }
}
