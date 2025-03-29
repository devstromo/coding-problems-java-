package com.devstromo.dynamic_programming.sherlock_and_cost;

import java.util.List;

class Result {

    /*
     * Complete the 'cost' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY B as parameter.
     */

    public static int cost(List<Integer> B) {
        int n = B.size();
        int low = 0;     // Max cost when A[i] = 1
        int high = 0;    // Max cost when A[i] = B[i]

        for (int i = 1; i < n; i++) {
            int lowToLow = low;
            int highToLow = high + Math.abs(B.get(i - 1) - 1);
            int lowToHigh = low + Math.abs(B.get(i) - 1);
            int highToHigh = high + Math.abs(B.get(i) - B.get(i - 1));

            int newLow = Math.max(lowToLow, highToLow);
            int newHigh = Math.max(lowToHigh, highToHigh);

            low = newLow;
            high = newHigh;
        }

        return Math.max(low, high);
    }

}
