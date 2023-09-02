package com.devstromo.easy.p1342;

class Solution {
    public static int numberOfSteps(int num) {
        var steps = 0;
        while (num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            steps++;
        }
        return steps;
    }

    public static int numberOfStepsBest(int num) {
        var steeps = 0;
        while (num > 0) {
            if ((num & 1) == 1)
                num--;
            else
                num /= 2;
            steeps++;
        }
        return steeps;

    }
}
