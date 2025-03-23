package com.devstromo.dynamic_programming.maximum_subarray_sum;

import java.util.List;

class Result {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSum = arr.get(0);
        int maxLocal = arr.get(0);
        int maxSeq = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            maxLocal = Math.max(arr.get(i), arr.get(i) + maxLocal);
            if (maxSum < maxLocal) {
                maxSum = maxLocal;
            }
            if (maxSeq < arr.get(i)) {
                maxSeq = arr.get(i);
            }
        }
        if (maxSeq <= 0) {
            return List.of(maxSum, maxSeq);
        }
        int sumSeq = 0;
        for (Integer num : arr) {
            if (num > 0) {
                sumSeq += num;
            }
        }
        return List.of(maxSum, sumSeq);
    }

}
