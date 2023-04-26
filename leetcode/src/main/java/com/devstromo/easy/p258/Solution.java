package com.devstromo.easy.p258;

class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        while (num > 9) {
            num = sumDigits(num);
        }
        return num;
    }

    public int addDigitsConstantTime(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public int addDigitsRecursive(int num) {
        if (num < 10) {
            return num;
        }
        return addDigitsRecursive(sumDigits(num));
    }

    private int sumDigits(int num) {
        var sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
