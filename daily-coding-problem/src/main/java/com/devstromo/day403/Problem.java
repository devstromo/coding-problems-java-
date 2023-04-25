package com.devstromo.day403;

import java.util.Random;

class Problem {
    private static final Random random = new Random();

    public static int rand5() {
        return 1 + random.nextInt(5);
    }

    public static int rand7() {
        while (true) {
            var row = rand5();
            var col = rand5();
            var index = (row - 1) * 5 + col;
            if (index <= 21) {
                return 1 + (index - 1) % 7;
            }
        }
    }
}
