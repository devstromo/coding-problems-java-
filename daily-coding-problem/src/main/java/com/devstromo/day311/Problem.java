package com.devstromo.day311;

public class Problem {
    public static int solve(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        return peakIndex(numbers, 0, numbers.length - 1);
    }

    private static int peakIndex(int[] numbers, int low, int high) {
        var mid = (high - low) / 2;
        if (mid == 0 || (numbers[mid - 1] < numbers[mid] && numbers[mid + 1] < numbers[mid]))
            return mid;
        else if (numbers[mid - 1] > numbers[mid]) {
            return peakIndex(numbers, low, mid - 1);
        }
        return peakIndex(numbers, mid + 1, high);
    }
}
